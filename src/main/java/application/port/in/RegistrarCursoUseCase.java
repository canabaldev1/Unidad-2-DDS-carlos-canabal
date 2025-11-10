package application.port.in;

import domain.model.curso.Curso;
import domain.valueobjects.curso.Aula;
import domain.valueobjects.profesor.ProfesorId;

import java.time.LocalDate;

public interface RegistrarCursoUseCase {
    Curso registrarCurso(String asignatura, int cupoMaximo, LocalDate fechaInicio, LocalDate fechaFin, Aula aula, ProfesorId profesorId);

}
