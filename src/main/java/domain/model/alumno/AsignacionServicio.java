package domain.model.alumno;

import domain.exceptions.AsignacionServicioException;
import domain.valueobjects.alumno.AlumnoId;
import domain.valueobjects.alumno.AsignacionServicioId;
import domain.valueobjects.alumno.ServicioComplementario;
import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public class AsignacionServicio {

    private final AsignacionServicioId id;
    private final AlumnoId alumnoId;
    private ServicioComplementario servicioComplementario;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;

    public ServicioComplementario getServicioComplementario() {
        return servicioComplementario;
    }

    public void setServicioComplementario(ServicioComplementario servicioComplementario) {
        this.servicioComplementario = servicioComplementario;
    }

    public AlumnoId getAlumnoId() {
        return alumnoId;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public AsignacionServicio(AsignacionServicioId id, AlumnoId alumnoId, ServicioComplementario servicioComplementario,
                              LocalDate fechaInicio, LocalDate fechaFin) {
        if (alumnoId == null) {
            throw new AsignacionServicioException("AlumnoId no puede ser nulo");
        }
        if (servicioComplementario == null) {
            throw new AsignacionServicioException("El servicio no puede ser nulo");
        }
        if (fechaInicio == null) {
            throw new AsignacionServicioException("La fecha de inicio no puede ser nula");
        }

        this.id = id;
        this.alumnoId = alumnoId;
        this.servicioComplementario = servicioComplementario;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
    }

    public AsignacionServicioId getId() {
        return id;
    }
}
