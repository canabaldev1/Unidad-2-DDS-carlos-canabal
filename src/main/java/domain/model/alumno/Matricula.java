package domain.model.alumno;

import domain.exceptions.MatriculaException;
import domain.valueobjects.shared.CicloAcademico;
import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public class Matricula {

    private int alumnoId;
    private int cursoId;
    private LocalDate fechaInscripcion;

    public Matricula(int alumnoId, int cursoId, LocalDate fechaInscripcion) {
        if (alumnoId <= 0) {
            throw new MatriculaException("AlumnoId no puede ser menor o igual a cero");
        }
        if (cursoId <= 0) {
            throw new MatriculaException("CursoId no puede ser menor o igual a cero");
        }
        if (fechaInscripcion == null) {
            throw new MatriculaException("Fecha de inscripción no puede ser nula");
        }

        this.cursoId = cursoId;
        this.alumnoId = alumnoId;
        this.fechaInscripcion = fechaInscripcion;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

}
