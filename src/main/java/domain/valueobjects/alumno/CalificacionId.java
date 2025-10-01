package domain.valueobjects.alumno;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class CalificacionId {

    private final String value;

    public CalificacionId(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("CalificacionId no puede ser nulo o vacío");
        }
        this.value = value;
    }

    // Aplicación de patrón factory 
    public static CalificacionId generate() {
        return new CalificacionId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }
}
