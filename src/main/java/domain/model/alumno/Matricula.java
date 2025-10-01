package domain.model.alumno;

import domain.exceptions.MatriculaException;
import domain.valueobjects.alumno.AlumnoId;
import domain.valueobjects.alumno.MatriculaId;
import domain.valueobjects.shared.CicloAcademico;
import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public class Matricula {

    private final MatriculaId id;
    private final AlumnoId alumnoId;
    private CicloAcademico cicloAcademico;
    private LocalDate fechaInscripcion;

    public Matricula(MatriculaId id, AlumnoId alumnoId, CicloAcademico cicloAcademico, LocalDate fechaInscripcion) {
        if (alumnoId == null) {
            throw new MatriculaException("AlumnoId no puede ser nulo");
        }
        if (cicloAcademico == null) {
            throw new MatriculaException("Ciclo académico no puede ser nulo");
        }
        if (fechaInscripcion == null) {
            throw new MatriculaException("Fecha de inscripción no puede ser nula");
        }

        this.id = id;
        this.alumnoId = alumnoId;
        this.cicloAcademico = cicloAcademico;
        this.fechaInscripcion = fechaInscripcion;
    }

    public MatriculaId getId() {
        return id;
    }
}
