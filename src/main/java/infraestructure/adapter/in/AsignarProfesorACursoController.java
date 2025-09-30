package infraestructure.adapter.in;

import application.port.in.AsignarProfesorACursoUseCase;
import application.port.in.command.AsignarProfesorACursoCommand;

/**
 *
 * @author lm-carlos
 */
public class AsignarProfesorACursoController {

    private final AsignarProfesorACursoUseCase useCase;

    public AsignarProfesorACursoController(AsignarProfesorACursoUseCase useCase) {
        this.useCase = useCase;
    }

    // Gestion de peticiones que recibe el controlador e invoca los puertos de entrada
    public void peticion() {

        // La peticion podría recibir datos
        // aquí el controller traduce los datos a una llamada al caso de uso
        AsignarProfesorACursoCommand command = new AsignarProfesorACursoCommand();

        useCase.handle(command);
    }

}
