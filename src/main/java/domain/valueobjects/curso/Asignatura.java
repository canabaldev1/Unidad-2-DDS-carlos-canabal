package domain.valueobjects.curso;

/**
 *
 * @author lm-carlos
 */
public record Asignatura(String nombre, String codigo) {
    public Asignatura {
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre de la asignatura no puede estar vacío");
        }
        if (codigo == null || codigo.isBlank()) {
            throw new IllegalArgumentException("El código de la asignatura no puede estar vacío");
        }
    }
}

