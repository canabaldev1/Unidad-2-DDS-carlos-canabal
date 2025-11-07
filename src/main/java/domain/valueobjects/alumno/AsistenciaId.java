package domain.valueobjects.alumno;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class AsistenciaId {

    private final String value;

    public AsistenciaId(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("AsistenciaId no puede ser nulo o vacío");
        }
        this.value = value;
    }

    // Aplicación de patrón factory 
    public static AsistenciaId generate() {
        return new AsistenciaId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }
}
