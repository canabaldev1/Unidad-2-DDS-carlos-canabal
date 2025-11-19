package application.services;

import application.port.in.CrearProfesorUseCase;
import application.port.in.command.CrearProfesorCommand;
import domain.model.profesor.Profesor;
import domain.port.out.repositories.RepositorioDeProfesores;
import domain.valueobjects.profesor.ProfesorId;
import domain.valueobjects.shared.DatosContacto;
import domain.valueobjects.shared.DatosPersonales;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author lm-carlos
 */
@Service
@Transactional
public class CrearProfesorService implements CrearProfesorUseCase{
private final RepositorioDeProfesores repositorioDeProfesores;

    public CrearProfesorService(RepositorioDeProfesores repositorioDeProfesores) {
        this.repositorioDeProfesores = repositorioDeProfesores;
    }

    @Override
    public void handle(CrearProfesorCommand command) {
        // 1. CREAR VALUE OBJECTS
        DatosPersonales datosPersonales = new DatosPersonales(
            command.nombre(),
            command.apellido(),
            command.fechaNacimiento()
        );
        

        // CREAR ID ÚNICO
        ProfesorId profesorId = ProfesorId.generate();

        // CREAR ENTIDAD DE DOMINIO
        Profesor profesor = new Profesor(profesorId, datosPersonales, command.especialidad());


        // GUARDAR
        repositorioDeProfesores.guardar(profesor);
    }
}
