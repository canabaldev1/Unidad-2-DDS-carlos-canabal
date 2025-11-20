/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package application.port.in.command;

import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public record CrearProfesorCommand(
    String nombre,
    String apellido, 
    LocalDate fechaNacimiento,
    String especialidad
) {}
