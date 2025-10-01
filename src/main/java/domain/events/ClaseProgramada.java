package domain.events;

import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public record ClaseProgramada(String claseId, Instant fecha) implements EventoDeDominio {

    @Override

    public String id() {
        return claseId;
    }
}
