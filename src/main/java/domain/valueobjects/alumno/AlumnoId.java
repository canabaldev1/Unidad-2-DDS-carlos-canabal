package domain.valueobjects.alumno;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class AlumnoId {

    private final String value;

    public AlumnoId(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("El AlumnoId no puede ser nulo o vacío");
        }
        this.value = value;
    }

    // Aplicación de patrón factory 
    public static AlumnoId generate() {
        return new AlumnoId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }
}
