package application.services;

import application.port.in.MatricularAlumnoUseCase;
import domain.model.alumno.Matricula;
import domain.port.out.repositories.RepositorioDeMatriculas;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import domain.valueobjects.shared.CicloAcademico;
import java.time.LocalDate;

/**
 *
 * @author Victor Garcia
 */
@Service
@Transactional
public class MatricularAlumnoService implements MatricularAlumnoUseCase {

    private final RepositorioDeMatriculas repo;

    public MatricularAlumnoService(RepositorioDeMatriculas repo) {
        this.repo = repo;
    }

    @Override
    public Matricula registrar(int alumnoId, int cursoId, LocalDate fechaInscripcion) {
        Matricula matricula = new Matricula(
                alumnoId,
                cursoId,
                fechaInscripcion
        );
        return repo.guardar(matricula);
    }
}
