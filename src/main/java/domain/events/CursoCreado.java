package domain.events;

import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public record CursoCreado(String cursoId, Instant fecha) implements EventoDeDominio {

    @Override

    public String id() {
        return cursoId;
    }
}
