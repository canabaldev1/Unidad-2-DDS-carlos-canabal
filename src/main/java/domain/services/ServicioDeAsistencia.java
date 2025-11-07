package domain.services;

import domain.enums.EstadoAsistencia;
import domain.events.AsistenciaRegistrada;
import domain.model.alumno.Alumno;
import domain.model.alumno.Asistencia;
import domain.model.curso.Sesion;
import domain.valueobjects.alumno.AsistenciaId;
import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public class ServicioDeAsistencia {

    public AsistenciaRegistrada registrarAsistencia(Alumno alumno, Sesion sesion, EstadoAsistencia estado) {

        Asistencia asistencia = new Asistencia(
                AsistenciaId.generate(),
                alumno.getId(),
                sesion.getId(),
                estado
        );

        return new AsistenciaRegistrada(asistencia.getId().getValue(), Instant.now());
    }
}
