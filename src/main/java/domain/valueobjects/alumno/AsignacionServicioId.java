package domain.valueobjects.alumno;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class AsignacionServicioId {

    private final String value;

    public AsignacionServicioId(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("AsignacionServicioId no puede ser nulo o vacío");
        }
        this.value = value;
    }

    // Aplicación de patrón factory 
    public static AsignacionServicioId generate() {
        return new AsignacionServicioId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }
}
