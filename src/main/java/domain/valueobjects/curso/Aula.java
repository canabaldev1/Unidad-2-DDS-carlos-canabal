package domain.valueobjects.curso;

/**
 *
 * @author lm-carlos
 */
public record Aula(String numero, String piso, String bloque, String nombre, int capacidad) {

    public Aula     {
        if (numero == null || numero.isBlank()) {
            throw new IllegalArgumentException("El número del aula no puede estar vacío");
        }
        if (piso == null || piso.isBlank()) {
            throw new IllegalArgumentException("El piso no puede estar vacío");
        }
        if (bloque == null || bloque.isBlank()) {
            throw new IllegalArgumentException("El bloque no puede estar vacío");
        }
        if (nombre == null || nombre.isBlank()) {
            throw new IllegalArgumentException("El nombre del aula no puede estar vacío");
        }
        if (capacidad <= 0) {
            throw new IllegalArgumentException("La capacidad debe ser mayor a cero");
        }
    }
}
