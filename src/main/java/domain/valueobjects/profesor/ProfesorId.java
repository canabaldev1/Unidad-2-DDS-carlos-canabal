package domain.valueobjects.profesor;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class ProfesorId {

    private final String value;

    public ProfesorId(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("El id del Profesor no puede ser nulo o vacío");
        }
        this.value = value;
    }

    public static ProfesorId generate() {
        return new ProfesorId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }
}
