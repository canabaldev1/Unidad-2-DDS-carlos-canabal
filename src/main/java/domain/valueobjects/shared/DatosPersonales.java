package domain.valueobjects.shared;

import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public record DatosPersonales(String nombres, String apellidos, LocalDate fechaNacimiento) {

  // domain.valueobjects.shared.DatosPersonales.java
    
    // Constructor compacto para validaciones
    public DatosPersonales {
        validarNombre(nombres);
        validarApellido(apellidos);
        validarFechaNacimiento(fechaNacimiento);
    }

    private void validarNombre(String nombre) {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío");
        }
        if (!nombre.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
            throw new IllegalArgumentException("El nombre solo puede contener letras y espacios");
        }
        if (nombre.length() < 2) {
            throw new IllegalArgumentException("El nombre debe tener al menos 2 caracteres");
        }
    }

    private void validarApellido(String apellido) {
        if (apellido == null || apellido.isBlank()) {
            throw new IllegalArgumentException("El apellido no puede estar vacío");
        }
        if (!apellido.matches("^[a-zA-ZáéíóúÁÉÍÓÚñÑ\\s]+$")) {
            throw new IllegalArgumentException("El apellido solo puede contener letras y espacios");
        }
    }

    private void validarFechaNacimiento(LocalDate fechaNacimiento) {
        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula");
        }
        
        LocalDate fechaMinima = LocalDate.now().minusYears(18);
        if (fechaNacimiento.isAfter(fechaMinima)) {
            throw new IllegalArgumentException("El profesor debe ser mayor de edad (18 años)");
        }
        
        LocalDate fechaMaxima = LocalDate.now().minusYears(90);
        if (fechaNacimiento.isBefore(fechaMaxima)) {
            throw new IllegalArgumentException("La fecha de nacimiento no es válida");
        }
    }

    // implementaciion de factory
    public static DatosPersonales crear(String nombres, String apellidos, LocalDate fechaNacimiento) {
        return new DatosPersonales(nombres.trim(), apellidos.trim(), fechaNacimiento);
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String apellidos() {
        return apellidos;
    }

    @Override
    public LocalDate fechaNacimiento() {
        return fechaNacimiento;
    }

    @Override
    public String nombres() {
        return nombres;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

}
