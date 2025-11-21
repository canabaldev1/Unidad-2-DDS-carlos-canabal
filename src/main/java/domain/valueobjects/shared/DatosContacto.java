package domain.valueobjects.shared;

import java.util.regex.Pattern;

/**
 *
 * @author lm-carlos
 */
public record DatosContacto(String telefono, String email, String direccion) {

    private static final Pattern TELEFONO_PATTERN = Pattern.compile("\\d+");

    @Override
    public String direccion() {
        return direccion;
    }

    @Override
    public String email() {
        return email;
    }

    @Override
    public String telefono() {
        return telefono;
    }

    private static final Pattern EMAIL_PATTERN = Pattern.compile(
            "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$"
    );

    public DatosContacto   {
        if (telefono == null || telefono.isBlank()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío");
        }
        if (!TELEFONO_PATTERN.matcher(telefono).matches()) {
            throw new IllegalArgumentException("El teléfono debe contener solo números");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("El email no puede estar vacío");
        }
        if (!EMAIL_PATTERN.matcher(email).matches()) {
            throw new IllegalArgumentException("Email con formato inválido");
        }

        if (direccion == null || direccion.isBlank()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía");
        }
    }

    // implementaciion de factory
    public static DatosContacto crear(String telefono, String email, String direccion) {
        return new DatosContacto(telefono, email, direccion);

    }
}
