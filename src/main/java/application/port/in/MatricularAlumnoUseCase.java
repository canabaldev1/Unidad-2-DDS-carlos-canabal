/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package application.port.in;

import application.port.in.command.MatricularAlumnoCommand;

/**
 *
 * @author lm-carlos
 */
public interface MatricularAlumnoUseCase {

    // Interfaz del puerto de entrada
    
    void handle(MatricularAlumnoCommand command);

}
