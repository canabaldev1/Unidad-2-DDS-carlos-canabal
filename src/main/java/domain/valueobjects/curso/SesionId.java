package domain.valueobjects.curso;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class SesionId {

    private final String value;

    public SesionId(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("El id de la Sesión no puede ser nulo o vacío");
        }
        this.value = value;
    }

    public static SesionId generate() {
        return new SesionId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }
}
