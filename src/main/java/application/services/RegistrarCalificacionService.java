package application.services;

import application.port.in.RegistrarCalificacionUseCase;
import application.port.in.command.RegistrarCalificacionCommand;

/**
 *
 * @author lm-carlos
 */
public class RegistrarCalificacionService implements RegistrarCalificacionUseCase {
    
    // implementacion del ṕuerto de entrada
    
    @Override
    public void handle(RegistrarCalificacionCommand command) {};

}
