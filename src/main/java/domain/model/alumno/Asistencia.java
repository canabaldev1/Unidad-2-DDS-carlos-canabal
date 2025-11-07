package domain.model.alumno;

import domain.enums.EstadoAsistencia;
import domain.exceptions.AsistenciaException;
import domain.valueobjects.alumno.AlumnoId;
import domain.valueobjects.alumno.AsistenciaId;
import domain.valueobjects.curso.SesionId;

/**
 *
 * @author lm-carlos
 */
public class Asistencia {

    private final AsistenciaId id;
    private final AlumnoId alumnoId;
    private final SesionId sesionId;
    private EstadoAsistencia estado;

    public Asistencia(AsistenciaId id, AlumnoId alumnoId, SesionId sesionId, EstadoAsistencia estado) {
        if (alumnoId == null) {
            throw new AsistenciaException("AlumnoId no puede ser nulo");
        }
        if (sesionId == null) {
            throw new AsistenciaException("SesionId no puede ser nulo");
        }
        if (estado == null) {
            throw new AsistenciaException("Estado no puede ser nulo");
        }

        this.id = id;
        this.alumnoId = alumnoId;
        this.sesionId = sesionId;
        this.estado = estado;
    }

    public AsistenciaId getId() {
        return id;
    }

    public void cambiarEstado(EstadoAsistencia nuevoEstado) {
        if (nuevoEstado == null) {
            throw new AsistenciaException("Nuevo estado no puede ser nulo");
        }
        this.estado = nuevoEstado;
    }
}
