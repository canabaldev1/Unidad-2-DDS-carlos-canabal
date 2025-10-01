package domain.events;

import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public record SesionRegistrada(String sesionId, Instant fecha) implements EventoDeDominio {

    @Override

    public String id() {
        return sesionId;
    }
}
