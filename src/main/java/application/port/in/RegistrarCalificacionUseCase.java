/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package application.port.in;

import application.port.in.command.RegistrarCalificacionCommand;

/**
 *
 * @author lm-carlos
 */
public interface RegistrarCalificacionUseCase {

    // Interfaz del puerto de entrada
    
    void handle(RegistrarCalificacionCommand command);

}
