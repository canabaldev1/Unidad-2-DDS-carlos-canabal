package domain.model.alumno;

import domain.exceptions.CalificacionException;
import domain.valueobjects.alumno.AlumnoId;
import domain.valueobjects.alumno.CalificacionId;
import domain.valueobjects.curso.ClaseId;

/**
 *
 * @author lm-carlos
 */
public class Calificacion {

    private final CalificacionId id;
    private final AlumnoId alumnoId;
    private final ClaseId claseId;
    private double nota1;
    private double nota2;
    private double nota3;
    private double notaFinal;

    public Calificacion(CalificacionId id, AlumnoId alumnoId, ClaseId claseId,
            double nota1, double nota2, double nota3, double notaFinal) {
        if (alumnoId == null) {
            throw new CalificacionException("AlumnoId no puede ser nulo");
        }
        if (claseId == null) {
            throw new CalificacionException("ClaseId no puede ser nulo");
        }

        this.id = id;
        this.alumnoId = alumnoId;
        this.claseId = claseId;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
        this.notaFinal = notaFinal;
    }

    public CalificacionId getId() {
        return id;
    }

    public void actualizarNotaFinal(double nuevaNota) {
        if (nuevaNota < 0 || nuevaNota > 5) {
            throw new CalificacionException("Nota inválida");
        }
        this.notaFinal = nuevaNota;
    }
}
