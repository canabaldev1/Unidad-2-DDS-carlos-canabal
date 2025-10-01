package domain.valueobjects.shared;

import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public record CicloAcademico(int año, LocalDate fechaInicio, LocalDate fechaFin) {

    public CicloAcademico   {
        if (año <= 0) {
            throw new IllegalArgumentException("El año debe ser mayor que cero");
        }
        if (fechaInicio == null || fechaFin == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas");
        }
        if (fechaFin.isBefore(fechaInicio)) {
            throw new IllegalArgumentException("La fecha de fin no puede ser anterior a la fecha de inicio");
        }
    }
}
