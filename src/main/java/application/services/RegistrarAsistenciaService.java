package application.services;

import application.port.in.RegistrarAsistenciaUseCase;
import application.port.in.command.RegistrarAsistenciaCommand;

/**
 *
 * @author lm-carlos
 */
public class RegistrarAsistenciaService implements RegistrarAsistenciaUseCase {
    
    // implementacion del puerto de entrada
    
    @Override
    public void handle(RegistrarAsistenciaCommand command) {};

}
