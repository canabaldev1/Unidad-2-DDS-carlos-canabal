package infraestructure.adapter.out.repositories.Curso;

import domain.model.curso.Curso;
import domain.port.out.repositories.RepositorioDeCursos;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class JpaRepositorioDeCursos implements RepositorioDeCursos {

    private final SpringDataCursoRepository springRepo;
    @PersistenceContext
    private EntityManager entityManager;

    public JpaRepositorioDeCursos(SpringDataCursoRepository springRepo) {
        this.springRepo = springRepo;
    }

    @Override
    @Transactional
    public Curso guardar(Curso curso) {
        String sql = """
        INSERT INTO cursos (asignatura, cupo_maximo, fecha_inicio, fecha_fin, aula, profesor_id)
        VALUES (?, ?, ?, ?, ?, ?)
        """;

        entityManager.createNativeQuery(sql)
                .setParameter(1, curso.getAsignatura())
                .setParameter(2, curso.getCupoMaximo())
                .setParameter(3, curso.getFechaInicio())
                .setParameter(4, curso.getFechaFin())
                .setParameter(5, curso.getAula() != null ? curso.getAula().toString() : null)
                .setParameter(6, curso.getProfesorId() != null ? curso.getProfesorId().toString() : null)
                .executeUpdate();

        return curso;
    }


    @Override
    public Optional<Curso> buscarPorId(String id) {
        return springRepo.findById(Long.valueOf(id))
                .map(entity -> new Curso(
                        null,
                        entity.getAsignatura(),
                        entity.getCupoMaximo()
                ));
    }

    @Override
    public List<Curso> listar() {
        return springRepo.findAll().stream()
                .map(entity -> new Curso(
                        null,
                        entity.getAsignatura(),
                        entity.getCupoMaximo()
                ))
                .collect(Collectors.toList());
    }
}
