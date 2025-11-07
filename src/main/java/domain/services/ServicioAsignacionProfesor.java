package domain.services;

import domain.events.ProfesorAsignado;
import domain.model.curso.Curso;
import domain.model.profesor.Profesor;
import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public class ServicioAsignacionProfesor {

    public ProfesorAsignado asignarProfesorACurso(Profesor profesor, Curso curso) {
        curso.asignarProfesor(profesor.getId());

        // Retornar evento de dominio
        return new ProfesorAsignado(profesor.getId().getValue(), Instant.now());
    }
}
