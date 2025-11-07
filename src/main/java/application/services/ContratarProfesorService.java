package application.services;

import application.port.in.ContratarProfesorUseCase;
import application.port.in.command.ContratarProfesorCommand;

/**
 *
 * @author lm-carlos
 */
public class ContratarProfesorService implements ContratarProfesorUseCase {

    // implementacion del puerto de entrada
    
    @Override
    public void handle(ContratarProfesorCommand command){};

}
