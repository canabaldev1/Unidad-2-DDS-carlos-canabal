package domain.services;

import domain.events.AlumnoAsignado;
import domain.model.alumno.Alumno;
import domain.model.curso.Curso;
import domain.specifications.CupoDisponibleSpecification;
import domain.specifications.Specification;
import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public class ServicioAsignacionAlumno {

    public AlumnoAsignado matricularAlumno(Alumno alumno, Curso curso) {

        Specification<Curso> capacidad = new CupoDisponibleSpecification();

        if (!capacidad.satisfechoPor(curso)) {
            throw new IllegalArgumentException("El curso no tiene cupos");
        }

        curso.inscribirAlumno(alumno.getId());

        // Retornar evento de dominio
        return new AlumnoAsignado(alumno.getId().getValue(), Instant.now());
    }

}
