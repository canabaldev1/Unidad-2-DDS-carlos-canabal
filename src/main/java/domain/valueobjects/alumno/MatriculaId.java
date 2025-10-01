package domain.valueobjects.alumno;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class MatriculaId {

    private final String value;

    public MatriculaId(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("MatriculaId no puede ser nulo o vacío");
        }
        this.value = value;
    }

    // Aplicación de patrón factory 
    public static MatriculaId generate() {
        return new MatriculaId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }
}
