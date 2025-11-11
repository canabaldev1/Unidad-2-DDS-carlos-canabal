package domain.valueobjects.curso;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class CursoId {

    private final int value;

    public CursoId(int value) {
        if (value <= 0 ) {
            throw new IllegalArgumentException("El id del Curso no puede ser nulo o vacío" + value);
        }
        this.value = value;
    }

    public static CursoId generate() {
        return new CursoId(UUID.randomUUID().hashCode());
    }

    public int getValue() {
        return value;
    }
}
