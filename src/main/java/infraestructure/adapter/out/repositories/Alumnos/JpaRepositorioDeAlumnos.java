package infraestructure.adapter.out.repositories.Alumnos;

import domain.model.alumno.Alumno;
import domain.port.out.repositories.RepositorioDeAlumnos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Repository
public class JpaRepositorioDeAlumnos implements RepositorioDeAlumnos {
    private final SpringDataAlumnosRepository springRepo;
    @PersistenceContext
    private EntityManager entityManager;

    public JpaRepositorioDeAlumnos(SpringDataAlumnosRepository springRepo) {
        this.springRepo = springRepo;
    }

    @Override
    @Transactional
    public Alumno guardar(Alumno alumno) {
        String sql = """
        INSERT INTO alumnos (nombre,  apellido,  fechanacimiento,  telefono,  email, direccion)
        VALUES (?, ?, ?, ?, ?, ?)
        """;

        entityManager.createNativeQuery(sql)
                .setParameter(1, alumno.getNombre())
                .setParameter(2, alumno.getApellido())
                .setParameter(3, alumno.getFechaNacimiento())
                .setParameter(4, alumno.getTelefono())
                .setParameter(5, alumno.getEmail())
                .setParameter(6, alumno.getDireccion())
                .executeUpdate();
        return alumno;
    }

    @Override
    public Optional<Alumno> buscarPorId(Integer id) {
        String sql = """
        Select
            id, nombre, apellido, fechanacimiento, telefono, email, direccion
        from alumnos WHERE id = ?
        """;

        List<Object[]> results = entityManager
                .createNativeQuery(sql)
                .setParameter(1, id)
                .getResultList();

        if (results.isEmpty()) {
            return Optional.empty();
        }

        Object[] row = results.getFirst();

        LocalDate fechaNacimiento = ((java.sql.Date) row[3]).toLocalDate();

        Alumno alumno = new Alumno (
            (Integer) row[0],
            (String) row[1],
            (String) row[2],
            fechaNacimiento,
            (String) row[4],
            (String) row[5],
            (String) row[6]
        );

        return Optional.of(alumno);
    }

    @Override
    public List<Alumno> listar() {
        return List.of();
    }
}
