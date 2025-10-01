package domain.valueobjects.shared;

import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public record DatosPersonales(String nombres, String apellidos, LocalDate fechaNacimiento) {

    public DatosPersonales   {
        if (nombres == null || nombres.isBlank()) {
            throw new IllegalArgumentException("Los nombres no pueden estar vacíos");
        }
        if (apellidos == null || apellidos.isBlank()) {
            throw new IllegalArgumentException("Los apellidos no pueden estar vacíos");
        }
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula");
        }
    }
    
    // implementaciion de factory
    public static DatosPersonales crear(String nombres, String apellidos, LocalDate fechaNacimiento) {
        return new DatosPersonales(nombres.trim(), apellidos.trim(), fechaNacimiento);
    }
    
}
