package domain.model.curso;

import domain.exceptions.ClaseException;
import domain.valueobjects.curso.ClaseId;
import domain.valueobjects.curso.CursoId;

/**
 *
 * @author lm-carlos
 */
public class Clase {

    private final ClaseId id;
    private final CursoId cursoId;
    private final String profesorId; 
    private String horario;

    public Clase(ClaseId id, CursoId cursoId, String profesorId, String horario) {
        if (cursoId == null) {
            throw new ClaseException("El cursoId no puede ser nulo");
        }
        if (profesorId == null || profesorId.isBlank()) {
            throw new ClaseException("El profesorId no puede ser nulo o vacío");
        }
        if (horario == null || horario.isBlank()) {
            throw new ClaseException("El horario no puede ser nulo o vacío");
        }

        this.id = id;
        this.cursoId = cursoId;
        this.profesorId = profesorId;
        this.horario = horario;
    }

    public void reprogramarHorario(String nuevoHorario) {
        if (nuevoHorario == null || nuevoHorario.isBlank()) {
            throw new ClaseException("El nuevo horario no puede ser nulo o vacío");
        }
        this.horario = nuevoHorario;
    }

    public ClaseId getId() {
        return id;
    }
}
