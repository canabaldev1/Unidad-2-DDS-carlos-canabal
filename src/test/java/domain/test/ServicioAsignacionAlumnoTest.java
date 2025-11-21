package domain.test;

import domain.events.AlumnoAsignado;
import org.junit.jupiter.api.Test;

import domain.events.AlumnoMatriculado;
import domain.model.alumno.Alumno;
import domain.model.curso.Curso;
import domain.services.ServicioAsignacionAlumno;
import domain.valueobjects.alumno.AlumnoId;
import domain.valueobjects.curso.CursoId;
import domain.valueobjects.shared.DatosContacto;
import domain.valueobjects.shared.DatosPersonales;
import java.time.Instant;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 *
 * @author lm-carlos
 */
class ServicioAsignacionAlumnoTest {
/*
    @Test
    void matricularAlumno_CuandoHayCupo_DeberiaRetornarEvento() {
        // Arrange

        AlumnoId idAlumnoNuevo = AlumnoId.generate();

        Alumno alumno = new Alumno(
                idAlumnoNuevo,
                new DatosPersonales("Carlos", "Canabal", LocalDate.of(1992, 9, 9)),
                new DatosContacto("3046088983", "c.canabal7@gmail.com", "Turbaco")
        );

        Curso curso = new Curso(CursoId.generate(),
                "Matematicas",
                2);

        ServicioAsignacionAlumno servicio = new ServicioAsignacionAlumno();

        // Act
        AlumnoAsignado evento = servicio.matricularAlumno(alumno, curso);

        // Assert
        assertNotNull(evento);
        assertEquals(idAlumnoNuevo.getValue(), evento.id());
        assertTrue(evento.fecha().isBefore(Instant.now().plusSeconds(1)));
        assertTrue(curso.getAlumnoIds().contains(idAlumnoNuevo));
    }

    @Test
    void matricularAlumno_CuandoNoHayCupo_DeberiaLanzarExcepcion() {

        AlumnoId idAlumnoNuevo = AlumnoId.generate();

        Alumno alumno = new Alumno(
                idAlumnoNuevo,
                new DatosPersonales("Carlos", "Canabal", LocalDate.of(1992, 9, 9)),
                new DatosContacto("3046088983", "c.canabal7@gmail.com", "Turbaco")
        );

        Curso curso = new Curso(CursoId.generate(),
                "Castellano",
                0);

        ServicioAsignacionAlumno servicio = new ServicioAsignacionAlumno();

        // Act & Assert
        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> servicio.matricularAlumno(alumno, curso)
        );

        assertEquals("El curso no tiene cupos", exception.getMessage());
    }*/
}
