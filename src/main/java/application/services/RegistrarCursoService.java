package application.services;

import application.port.in.RegistrarCursoUseCase;
import domain.model.curso.Curso;
import domain.port.out.repositories.RepositorioDeCursos;
import domain.valueobjects.curso.CursoId;
import domain.valueobjects.curso.Aula;
import domain.valueobjects.profesor.ProfesorId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.time.LocalDate;

@Service
@Transactional
public class RegistrarCursoService implements RegistrarCursoUseCase{

    private final RepositorioDeCursos repositorioDeCursos;

    @Autowired
    public RegistrarCursoService(RepositorioDeCursos repositorioDeCursos) {
        this.repositorioDeCursos = repositorioDeCursos;
    }

    @Override
    public Curso registrarCurso(String asignatura, int cupoMaximo, LocalDate fechaInicio, LocalDate fechaFin, Aula aula, String profesorId) {
        Curso curso = new Curso(
                asignatura,
                fechaInicio,
                fechaFin,
                cupoMaximo,
                aula,
                profesorId
        );
        return repositorioDeCursos.guardar(curso);
    }
}
