/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package application.port.in;

import application.port.in.command.RegistrarAsistenciaCommand;

/**
 *
 * @author lm-carlos
 */
public interface RegistrarAsistenciaUseCase {

    // Interfaz del puerto de entrada
    
    void handle(RegistrarAsistenciaCommand command);

}
