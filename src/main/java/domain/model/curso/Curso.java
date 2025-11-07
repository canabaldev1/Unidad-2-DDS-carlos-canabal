package domain.model.curso;

import domain.exceptions.CursoException;
import domain.valueobjects.alumno.AlumnoId;
import domain.valueobjects.curso.Aula;
import domain.valueobjects.curso.ClaseId;
import domain.valueobjects.curso.CursoId;
import domain.valueobjects.profesor.ProfesorId;
import domain.valueobjects.shared.CicloAcademico;
import java.util.ArrayList;
import java.util.List;

/**
 *s
 * @author lm-carlos
 */
public class Curso {

    private final CursoId id;
    private String asignatura;
    private CicloAcademico cicloAcademico;
    private int cupoMaximo;
    private Aula aula;
    private List<AlumnoId> alumnoIds;  
    private List<ClaseId> claseIds;
    private ProfesorId profesorId; 

    public Curso(CursoId id, String asignatura, CicloAcademico cicloAcademico, int cupoMaximo, Aula aula, ProfesorId profesorId) {
        if (asignatura == null || asignatura.isBlank()) {
            throw new CursoException("La asignatura no puede ser nula o vacía");
        }
        if (cupoMaximo <= 0) {
            throw new CursoException("El cupo máximo debe ser mayor a cero");
        }
        if (aula == null) {
            throw new CursoException("El aula no puede ser nula o vacía");
        }
        if (profesorId == null) {
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

    public Curso(CursoId id, String asignatura, int cupoMaximo) {
        this.id = id;
        this.asignatura = asignatura;
        this.cupoMaximo = cupoMaximo;
        this.alumnoIds = new ArrayList<>();
        this.claseIds = new ArrayList<>();
    }
    
    

    public void inscribirAlumno(AlumnoId alumnoId) {
        if (alumnoId == null) {
            throw new CursoException("El alumnoId no puede ser nulo o vacío");
        }
        if (alumnoIds.size() >= cupoMaximo) {
            throw new CursoException("No hay cupo disponible en el curso");
        }
        alumnoIds.add(alumnoId);
    }

    public void asignarProfesor(ProfesorId profesorId) {
        if (profesorId == null ) {
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

    public List<AlumnoId> getAlumnoIds() {
        return alumnoIds;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public CursoId getId() {
        return id;
    }
}
