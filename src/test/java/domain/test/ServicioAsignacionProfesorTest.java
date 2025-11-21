package domain.test;

import domain.events.ProfesorAsignado;
import domain.model.curso.Curso;
import domain.model.profesor.Profesor;
import domain.services.ServicioAsignacionProfesor;
import domain.valueobjects.curso.CursoId;
import domain.valueobjects.profesor.ProfesorId;
import domain.valueobjects.shared.DatosPersonales;
import java.time.Instant;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author lm-carlos
 */
public class ServicioAsignacionProfesorTest {
    /*
    
    @Test
    void asignarProfesorACurso_deberiaRetornarEventoProfesorAsignado() {
        // Arrange
        ProfesorId idProfesor = ProfesorId.generate();
        
        Profesor profesor = new Profesor(
                idProfesor,
                new DatosPersonales("Albert", "Einstein", LocalDate.of(1979, 3, 14)),
                "Fisica Cuantica"
        );


        Curso curso = new Curso(CursoId.generate(),
                "Fisica",
                0);

        ServicioAsignacionProfesor servicio = new ServicioAsignacionProfesor();


        ProfesorAsignado evento = servicio.asignarProfesorACurso(profesor, curso);

        // Assert
        assertNotNull(evento);
        assertEquals(idProfesor.getValue(), evento.id());
        assertNotNull(evento.fecha());
        assertTrue(evento.fecha().isBefore(Instant.now().plusSeconds(1)));
    }
*/
}
