package domain.events;

import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public record AlumnoMatriculado(String alumnoId, Instant fecha) implements EventoDeDominio {

    @Override

    public String id() {
        return alumnoId;
    }
    
    
}
