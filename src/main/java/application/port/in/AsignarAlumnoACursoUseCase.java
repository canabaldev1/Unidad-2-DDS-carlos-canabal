/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package application.port.in;

import application.port.in.command.AsignarAlumnoACursoCommand;

/**
 *
 * @author lm-carlos
 */
public interface AsignarAlumnoACursoUseCase {
    
    // Interfaz del puerto de entrada
    
    void handle (AsignarAlumnoACursoCommand command);
    
}
