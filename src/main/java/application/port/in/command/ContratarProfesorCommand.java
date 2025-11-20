/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package application.port.in.command;

import domain.valueobjects.profesor.ProfesorId;
import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public record ContratarProfesorCommand(
        ProfesorId profesorId,
        String cicloAcademico,
        LocalDate fechaInicio,
        LocalDate fechaFin,
        double salario
        ) {

}
