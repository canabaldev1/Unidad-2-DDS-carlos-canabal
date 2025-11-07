package domain.events;

import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public record AsistenciaRegistrada(String asistenciaId, Instant fecha) implements EventoDeDominio {

    @Override

    public String id() {
        return asistenciaId;
    }
}
