package infraestructure.adapter.in;

import application.port.in.RegistrarCursoUseCase;
import domain.model.curso.Curso;
import domain.valueobjects.curso.Aula;
import domain.valueobjects.profesor.ProfesorId;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class CursoController {

    private final RegistrarCursoUseCase registrarCursoUseCase;

    public CursoController(RegistrarCursoUseCase registrarCursoUseCase) {
        this.registrarCursoUseCase = registrarCursoUseCase;
    }

    /**
     * Controlador para registrar un curso desde cualquier adaptador de entrada (Swing, REST, CLI, etc).
     */
    public Curso registrarCurso(
            String asignatura,
            int cupoMaximo,
            LocalDate fechaInicio,
            LocalDate fechaFin,
            Aula aula,
            String profesorId
    ) {

        if (asignatura == null || asignatura.isBlank()) {
            throw new IllegalArgumentException("La asignatura no puede estar vacía");
        }

        if (fechaInicio == null || fechaFin == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas");
        }

        if (fechaFin.isBefore(fechaInicio)) {
            throw new IllegalArgumentException("La fecha de fin no puede ser anterior a la de inicio");
        }

        if (cupoMaximo <= 0) {
            throw new IllegalArgumentException("El cupo máximo debe ser mayor a cero");
        }

        // Delegación al caso de uso (lógica de negocio)
        return registrarCursoUseCase.registrarCurso(
                asignatura,
                cupoMaximo,
                fechaInicio,
                fechaFin,
                aula,
                profesorId
        );
    }
}
