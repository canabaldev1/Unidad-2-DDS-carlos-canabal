package domain.model.profesor;

import domain.exceptions.ProfesorException;
import domain.valueobjects.profesor.ProfesorId;
import domain.valueobjects.shared.DatosPersonales;

/**
 *
 * @author lm-carlos
 */
public class Profesor {

    private final ProfesorId id;
    private DatosPersonales datosPersonales;
    private String especialidad;

    public Profesor(ProfesorId id, DatosPersonales datosPersonales, String especialidad) {
        if (datosPersonales == null) {
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

    public DatosPersonales getDatosPersonales() {
        return datosPersonales;
    }

    public String getEspecialidad() {
        return especialidad;
    }

}
