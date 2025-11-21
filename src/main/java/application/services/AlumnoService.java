package application.services;

import application.port.in.RegistrarAlumnoUseCase;
import domain.model.alumno.Alumno;
import domain.port.out.repositories.RepositorioDeAlumnos;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.Optional;

@Service
@Transactional
public class AlumnoService implements RegistrarAlumnoUseCase {

    private final RepositorioDeAlumnos repo;

    public AlumnoService(RepositorioDeAlumnos repo) {
        this.repo = repo;
    }

    @Override
    public Alumno registrar(Integer id,String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String email, String direccion) {
        Alumno alumno = new Alumno(
                null,
                nombre,
                apellido,
                fechaNacimiento,
                telefono,
                email,
                direccion
        );
        return repo.guardar(alumno);
    }

    @Override
    public Optional<Alumno> buscarAlumnoPorId(Integer Id) {
        if (Id == null || Id <= 0) {
            return Optional.empty();
        }
        return repo.buscarPorId(Id);
    }
}
