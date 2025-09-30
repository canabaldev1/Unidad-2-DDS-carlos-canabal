package infraestructure.adapter.in;

import application.port.in.AsignarAlumnoACursoUseCase;
import application.port.in.command.AsignarAlumnoACursoCommand;

/**
 *
 * @author lm-carlos
 */
public class RegistrarCalificacionController {

    private final AsignarAlumnoACursoUseCase useCase;

    public RegistrarCalificacionController(AsignarAlumnoACursoUseCase useCase) {
        this.useCase = useCase;
    }

    // Gestion de peticiones que recibe el controlador e invoca los puertos de entrada
    public void peticion() {

        // La peticion podría recibir datos
        // aquí el controller traduce los datos a una llamada al caso de uso
        AsignarAlumnoACursoCommand command = new AsignarAlumnoACursoCommand();

        useCase.handle(command);
    }

}
