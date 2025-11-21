package application.port.in;

import domain.model.alumno.Alumno;

import java.time.LocalDate;
import java.util.Optional;

public interface RegistrarAlumnoUseCase {
    Alumno registrar(Integer id,String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String email, String direccion);
    Optional<Alumno> buscarAlumnoPorId(Integer  Id);
}
