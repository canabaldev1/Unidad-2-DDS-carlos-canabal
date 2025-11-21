package infraestructure.adapter.in;

import application.port.in.RegistrarAlumnoUseCase;
import domain.model.alumno.Alumno;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.Optional;

@Component
public class AlumnosController {

    private final RegistrarAlumnoUseCase registrarAlumnoUseCase;

    public AlumnosController(RegistrarAlumnoUseCase registrarAlumnoUseCase) {
        this.registrarAlumnoUseCase = registrarAlumnoUseCase;
    }

    public Alumno registrarAlumno(
            String nombres,
            String apellidos,
            LocalDate fechaNacimiento,
            String telefono,
            String email,
            String direccion
    ) {
        if (nombres == null || nombres.isBlank()) {
            throw new IllegalArgumentException("Los nombres no pueden estar vacíos");
        }

        if (apellidos == null || apellidos.isBlank()) {
            throw new IllegalArgumentException("Los apellidos no pueden estar vacíos");
        }

        if (fechaNacimiento == null) {
            throw new IllegalArgumentException("La fecha de nacimiento no puede ser nula");
        }

        if (telefono == null || telefono.isBlank()) {
            throw new IllegalArgumentException("El teléfono no puede estar vacío");
        }

        if (email == null || email.isBlank()) {
            throw new IllegalArgumentException("El email no puede estar vacío");
        }

        if (direccion == null || direccion.isBlank()) {
            throw new IllegalArgumentException("La dirección no puede estar vacía");
        }

        // Delegación al caso de uso (lógica de negocio)
        return registrarAlumnoUseCase.registrar(
                null,
                nombres,
                apellidos,
                fechaNacimiento,
                telefono,
                email,
                direccion
        );
    }

    public Optional<Alumno> buscarAlumnoPorId(Integer id) {
        if (id == null || id <= 0) {
            throw new IllegalArgumentException("El ID del alumno debe ser un número positivo");
        }
        return registrarAlumnoUseCase.buscarAlumnoPorId(id);
    }
}
