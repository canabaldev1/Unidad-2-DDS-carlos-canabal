package domain.model.curso;

import domain.exceptions.CursoException;
import domain.valueobjects.curso.ClaseId;
import domain.valueobjects.curso.CursoId;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lm-carlos
 */
public class Curso {

    private final CursoId id;
    private String asignatura;
    private String cicloAcademico;
    private int cupoMaximo;
    private String aula;
    private final List<String> alumnoIds;  // Podrían ser VO AlumnoId
    private final List<ClaseId> claseIds;
    private String profesorId; // Podría ser VO ProfesorId

    public Curso(CursoId id, String asignatura, String cicloAcademico, int cupoMaximo, String aula, String profesorId) {
        if (asignatura == null || asignatura.isBlank()) {
            throw new CursoException("La asignatura no puede ser nula o vacía");
        }
        if (cicloAcademico == null || cicloAcademico.isBlank()) {
            throw new CursoException("El ciclo académico no puede ser nulo o vacío");
        }
        if (cupoMaximo <= 0) {
            throw new CursoException("El cupo máximo debe ser mayor a cero");
        }
        if (aula == null || aula.isBlank()) {
            throw new CursoException("El aula no puede ser nula o vacía");
        }
        if (profesorId == null || profesorId.isBlank()) {
            throw new CursoException("El profesorId no puede ser nulo o vacío");
        }

        this.id = id;
        this.asignatura = asignatura;
        this.cicloAcademico = cicloAcademico;
        this.cupoMaximo = cupoMaximo;
        this.aula = aula;
        this.profesorId = profesorId;
        this.alumnoIds = new ArrayList<>();
        this.claseIds = new ArrayList<>();
    }

    public void inscribirAlumno(String alumnoId) {
        if (alumnoId == null || alumnoId.isBlank()) {
            throw new CursoException("El alumnoId no puede ser nulo o vacío");
        }
        if (alumnoIds.size() >= cupoMaximo) {
            throw new CursoException("No hay cupo disponible en el curso");
        }
        alumnoIds.add(alumnoId);
    }

    public void asignarProfesor(String profesorId) {
        if (profesorId == null || profesorId.isBlank()) {
            throw new CursoException("El profesorId no puede ser nulo o vacío");
        }

        this.profesorId = profesorId;

    }

    public void agregarClase(ClaseId claseId) {
        if (claseId == null) {
            throw new CursoException("El claseId no puede ser nulo");
        }
        claseIds.add(claseId);
    }

    public List<String> getAlumnoIds() {
        return alumnoIds;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public CursoId getId() {
        return id;
    }
}
