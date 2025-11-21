package infraestructure.adapter.in;

import application.port.in.MatricularAlumnoUseCase;
import domain.model.alumno.Matricula;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
@Component
public class MatriculasController {

    private final MatricularAlumnoUseCase useCase;

    public MatriculasController(MatricularAlumnoUseCase useCase) {
        this.useCase = useCase;
    }

    public Matricula matricularAlumno(int alumnoId, int cursoId, LocalDate fechaInscripcion) {
        if (alumnoId <= 0) {
            throw new IllegalArgumentException("El ID del alumno debe ser un número positivo");
        }

        if (cursoId <= 0) {
            throw new IllegalArgumentException("El ID del curso debe ser un número positivo");
        }

        if (fechaInscripcion == null) {
            throw new IllegalArgumentException("La fecha de inscripción no puede ser nula");
        }
        return useCase.registrar(alumnoId, cursoId, fechaInscripcion);
    }
}