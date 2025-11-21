package infraestructure.adapter.out.repositories;

import domain.model.profesor.Contrato;
import domain.port.out.repositories.RepositorioDeContratos;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lm-carlos
 */
@Repository
public class JpaRepositorioDeContratos implements RepositorioDeContratos {

    private final SpringDataContratoRepository springRepo;

    public JpaRepositorioDeContratos(SpringDataContratoRepository springRepo) {
        this.springRepo = springRepo;
    }

    @Override
    public Contrato guardar(Contrato contrato) {

        JpaContratoEntity entity = new JpaContratoEntity(
                contrato.getId().getValue(),
                contrato.getProfesorId().getValue(),
                contrato.getNumero(),
                contrato.getCicloAcademico(),
                contrato.getFechaInicio(),
                contrato.getFechaFin(),
                contrato.getSalario()
        );

        springRepo.save(entity);

        return contrato;
    }

    @Override
    public Optional<Contrato> buscarPorId(String id) {
        return springRepo.findById(id)
                .map(entity -> new Contrato(
                entity.getId(),
                entity.getProfesorId(),
                entity.getNumero(),
                entity.getCicloAcademico(),
                entity.getFechaInicio(),
                entity.getFechaFin(),
                entity.getSalario()
        ));

    }

    @Override
    public List<Contrato> listar() {
        return springRepo.findAll().stream()
                .map(entity -> new Contrato(
                entity.getId(),
                entity.getProfesorId(),
                entity.getNumero(),
                entity.getCicloAcademico(),
                entity.getFechaInicio(),
                entity.getFechaFin(),
                entity.getSalario()
        ))
                .collect(Collectors.toList());
    }

}
