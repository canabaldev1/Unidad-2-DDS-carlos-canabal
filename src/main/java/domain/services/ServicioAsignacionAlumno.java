package domain.services;

import domain.events.AlumnoMatriculado;
import domain.model.alumno.Alumno;
import domain.model.curso.Curso;
import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public class ServicioAsignacionAlumno {

    public AlumnoMatriculado matricularAlumno(Alumno alumno, Curso curso) {
        curso.inscribirAlumno(alumno.getId().toString());

        // Retornar evento de dominio
        return new AlumnoMatriculado(alumno.getId().getValue(), Instant.now());
    }

}
