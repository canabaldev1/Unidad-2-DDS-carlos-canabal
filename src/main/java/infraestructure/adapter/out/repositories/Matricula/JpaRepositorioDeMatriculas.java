package infraestructure.adapter.out.repositories.Matricula;

import domain.model.alumno.Matricula;
import domain.port.out.repositories.RepositorioDeMatriculas;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Repository
public class JpaRepositorioDeMatriculas implements RepositorioDeMatriculas {
    private final SpringDataMatriculasRepository springRepo;
    @PersistenceContext
    private EntityManager entityManager;

    public JpaRepositorioDeMatriculas(SpringDataMatriculasRepository springRepo) {
        this.springRepo = springRepo;
    }

    @Override
    @Transactional
    public Matricula guardar(Matricula matricula) {
        String sql = """
        INSERT INTO matriculas (alumno_id,  curso_id,  fecha_inscripcion)
        VALUES (?, ?, ?)
        """;

        entityManager.createNativeQuery(sql)
                .setParameter(1, matricula.getAlumnoId())
                .setParameter(2, matricula.getCursoId())
                .setParameter(3, matricula.getFechaInscripcion())
                .executeUpdate();
        return matricula;
    }

    @Override
    public Optional<Matricula> buscarPorId(String id) {
        return Optional.empty();
    }

    @Override
    public List<Matricula> listar() {
        return List.of();
    }
}
