package domain.valueobjects.shared;

import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public record CicloAcademico(LocalDate fechaInicio, LocalDate fechaFin) {

    public CicloAcademico   {
        if (fechaInicio == null || fechaFin == null) {
            throw new IllegalArgumentException("Las fechas no pueden ser nulas");
        }
        if (fechaFin.isBefore(fechaInicio)) {
            throw new IllegalArgumentException("La fecha de fin no puede ser anterior a la fecha de inicio");
        }
    }

    // implementacion de factory
    public static CicloAcademico crear(LocalDate fechaInicio, LocalDate fechaFin) {
        return new CicloAcademico(fechaInicio, fechaFin);
    }
}
