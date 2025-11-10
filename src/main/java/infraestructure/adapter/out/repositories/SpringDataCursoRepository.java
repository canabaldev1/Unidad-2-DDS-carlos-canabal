package infraestructure.adapter.out.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

public interface SpringDataCursoRepository extends JpaRepository<JpaCursoEntity, Long> {
}
