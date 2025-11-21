package application.services;

import application.port.in.ContratarProfesorUseCase;
import application.port.in.command.ContratarProfesorCommand;
import domain.model.profesor.Contrato;
import domain.port.out.repositories.RepositorioDeContratos;
import domain.valueobjects.profesor.ContratoId;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author lm-carlos
 */
@Service
@Transactional
public class ContratarProfesorService implements ContratarProfesorUseCase {

    private final RepositorioDeContratos repositorioDeContratos;

    public ContratarProfesorService(RepositorioDeContratos repositorioDeContratos) {
        this.repositorioDeContratos = repositorioDeContratos;
    }

    @Override
    public void handle(ContratarProfesorCommand command) {

        // GENERAR ID único para contrato
        ContratoId contratoId = ContratoId.generate();

        // Crear contrato con los datos del comando y el id generado
        Contrato contrato = new Contrato(
                contratoId,
                command.profesorId(),
                command.numero(),
                command.cicloAcademico(),
                command.fechaInicio(),
                command.fechaFin(),
                command.salario()
        );

        repositorioDeContratos.guardar(contrato);

    }
}
