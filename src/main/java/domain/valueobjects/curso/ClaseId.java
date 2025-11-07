package domain.valueobjects.curso;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class ClaseId {

    private final String value;

    public ClaseId(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("El id de la Clase no puede ser nulo o vacío");
        }
        this.value = value;
    }

    public static ClaseId generate() {
        return new ClaseId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }
}
