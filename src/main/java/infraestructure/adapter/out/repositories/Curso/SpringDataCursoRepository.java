package infraestructure.adapter.out.repositories.Curso;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCursoRepository extends JpaRepository<JpaCursoEntity, Long> {
}
