package domain.valueobjects.curso;

import java.time.LocalTime;

/**
 *
 * @author lm-carlos
 */
public record Horario(String diaSemana, LocalTime horaInicio, LocalTime horaFin) {

    public Horario   {
        if (diaSemana == null || diaSemana.isBlank()) {
            throw new IllegalArgumentException("El día de la semana no puede estar vacío");
        }
        if (horaInicio == null || horaFin == null) {
            throw new IllegalArgumentException("Las horas no pueden ser nulas");
        }
        if (horaFin.isBefore(horaInicio)) {
            throw new IllegalArgumentException("La hora de fin no puede ser anterior a la hora de inicio");
        }
    }
}
