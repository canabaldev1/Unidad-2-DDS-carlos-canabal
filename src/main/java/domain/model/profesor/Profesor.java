package domain.model.profesor;

import domain.exceptions.ProfesorException;
import domain.valueobjects.profesor.ProfesorId;

/**
 *
 * @author lm-carlos
 */
public class Profesor {

    private final ProfesorId id;
    private String datosPersonales;
    private String especialidad;

    public Profesor(ProfesorId id, String datosPersonales, String especialidad) {
        if (datosPersonales == null || datosPersonales.isBlank()) {
            throw new ProfesorException("Los datos personales no pueden ser nulos o vacíos");
        }
        if (especialidad == null || especialidad.isBlank()) {
            throw new ProfesorException("La especialidad no puede ser nula o vacía");
        }
        this.id = id;
        this.datosPersonales = datosPersonales;
        this.especialidad = especialidad;
    }

    public void cambiarEspecialidad(String nuevaEspecialidad) {
        if (nuevaEspecialidad == null || nuevaEspecialidad.isBlank()) {
            throw new ProfesorException("La nueva especialidad no es válida");
        }
        this.especialidad = nuevaEspecialidad;
    }

    public ProfesorId getId() {
        return id;
    }

    public String getDatosPersonales() {
        return datosPersonales;
    }

    public String getEspecialidad() {
        return especialidad;
    }

}
