package domain.valueobjects.alumno;

import domain.enums.TipoServicio;
import java.math.BigDecimal;

/**
 *
 * @author lm-carlos
 */
public record ServicioComplementario(TipoServicio tipoServicio, String descripcion, BigDecimal costo) {
    

    public ServicioComplementario {
        if (tipoServicio == null) {
            throw new IllegalArgumentException("El tipo de servicio no puede ser nulo");
        }
        if (descripcion == null || descripcion.isBlank()) {
            throw new IllegalArgumentException("La descripción no puede estar vacía");
        }
        if (costo == null || costo.compareTo(BigDecimal.ZERO) < 0) {
            throw new IllegalArgumentException("El costo no puede ser nulo ni negativo");
        }
    }
}
