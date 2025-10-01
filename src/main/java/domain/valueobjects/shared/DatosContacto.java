package domain.valueobjects.shared;

/**
 *
 * @author lm-carlos
 */
public record DatosContacto(String telefono, String email, String direccion) {

    public DatosContacto   {
        if (telefono == null || telefono.isBlank()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío");
        }
        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("El email no puede estar vacío");
        }
        if (direccion == null || direccion.isBlank()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía");
        }
    }
}
