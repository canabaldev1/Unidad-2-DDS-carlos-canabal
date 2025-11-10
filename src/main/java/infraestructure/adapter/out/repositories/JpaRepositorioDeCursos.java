package infraestructure.adapter.out.repositories;

import domain.model.curso.Curso;
import domain.port.out.repositories.RepositorioDeCursos;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Repository
public class JpaRepositorioDeCursos implements RepositorioDeCursos {

    private final SpringDataCursoRepository springRepo;

    public JpaRepositorioDeCursos(SpringDataCursoRepository springRepo) {
        this.springRepo = springRepo;
    }

    @Override
    public Curso guardar(Curso curso) {
        JpaCursoEntity entity = new JpaCursoEntity(
                curso.getAsignatura(),
                curso.getFechaInicio(),
                curso.getFechaFin(),
                curso.getCupoMaximo(),
                curso.getAula() != null ? curso.getAula().toString() : null,
                curso.getProfesorId() != null ? curso.getProfesorId().toString() : null
        );
        springRepo.save(entity);
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
