package domain.services;

import domain.events.AlumnoMatriculado;
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

    public AlumnoMatriculado matricularAlumno(Alumno alumno, Curso curso) {

        Specification<Curso> capacidad = new CupoDisponibleSpecification();

        if (!capacidad.satisfechoPor(curso)) {
            throw new IllegalArgumentException("El curso no tiene cupos");
        }

        curso.inscribirAlumno(alumno.getId());

        // Retornar evento de dominio
        return new AlumnoMatriculado(alumno.getId().getValue(), Instant.now());
    }

}
