package domain.valueobjects.curso;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class CursoId {

    private final String value;

    public CursoId(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("El id del Curso no puede ser nulo o vacío");
        }
        this.value = value;
    }

    public static CursoId generate() {
        return new CursoId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }
}
