/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package application.port.in;

import domain.model.alumno.Matricula;
import domain.valueobjects.shared.CicloAcademico;
import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public interface MatricularAlumnoUseCase {
    Matricula registrar(int alumnoId, int cursoId, LocalDate fechaInscripcion);
}
