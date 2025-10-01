package domain.events;

import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public record ProfesorContratado(String profesorId, Instant fecha) implements EventoDeDominio {

    @Override

    public String id() {
        return profesorId;
    }
}
