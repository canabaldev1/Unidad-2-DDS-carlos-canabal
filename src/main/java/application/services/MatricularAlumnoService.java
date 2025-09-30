package application.services;

import application.port.in.MatricularAlumnoUseCase;
import application.port.in.command.MatricularAlumnoCommand;

/**
 *
 * @author lm-carlos
 */
public class MatricularAlumnoService implements MatricularAlumnoUseCase {
    
    // implementacion del ṕuerto de entrada
    
    @Override
    public void handle(MatricularAlumnoCommand command){};

}
