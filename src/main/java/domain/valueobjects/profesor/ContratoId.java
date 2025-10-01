package domain.valueobjects.profesor;

import java.util.UUID;

/**
 *
 * @author lm-carlos
 */
public class ContratoId {

    private final String value;

    public ContratoId(String value) {
        if (value == null || value.isBlank()) {
            throw new IllegalArgumentException("El id del Contrato no puede ser nulo o vacío");
        }
        this.value = value;
    }

    public static ContratoId generate() {
        return new ContratoId(UUID.randomUUID().toString());
    }

    public String getValue() {
        return value;
    }
}
