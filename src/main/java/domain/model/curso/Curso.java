package domain.model.curso;

import domain.exceptions.CursoException;
import domain.valueobjects.alumno.AlumnoId;
import domain.valueobjects.curso.Aula;
import domain.valueobjects.curso.ClaseId;
import domain.valueobjects.curso.CursoId;
import domain.valueobjects.profesor.ProfesorId;
import domain.valueobjects.shared.CicloAcademico;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

/**
 *s
 * @author lm-carlos
 */
public class Curso {
    private Integer CursoId;
    private String asignatura;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private int cupoMaximo;
    private Aula aula;
    private List<AlumnoId> alumnoIds;  
    private List<ClaseId> claseIds;
    private String profesorId;

    public Curso(Integer CursoId,String asignatura, LocalDate fechaInicio, LocalDate fechaFin , int cupoMaximo, Aula aula, String profesorId) {
        if (asignatura == null || asignatura.isBlank()) {
            JOptionPane.showMessageDialog(null, "La asignatura no puede ser nula o vacía", "Error", JOptionPane.ERROR_MESSAGE);
            throw new CursoException("La asignatura no puede ser nula o vacía");
        }
        if (cupoMaximo <= 0) {
            JOptionPane.showMessageDialog(null, "El cupo máximo debe ser mayor a cero", "Error", JOptionPane.ERROR_MESSAGE);
            throw new CursoException("El cupo máximo debe ser mayor a cero");
        }
        if (fechaInicio == null || fechaFin == null || fechaFin.isBefore(fechaInicio)) {
            throw new CursoException("Fechas de ciclo académico inválidas");
        }

        this.CursoId = CursoId;
        this.asignatura = asignatura;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.cupoMaximo = cupoMaximo;
        this.aula = aula;
        this.profesorId = profesorId;
        //pendiente por hacer
        //guardar listas con los id's de los estudiantes en tablas independientes
        //y las listas con los id's de las clases en tablas independientes
        this.alumnoIds = new ArrayList<>();
        this.claseIds = new ArrayList<>();
    }

    public void inscribirAlumno(AlumnoId alumnoId) {
        if (alumnoId == null) {
            throw new CursoException("El alumnoId no puede ser nulo o vacío");
        }
        if (alumnoIds.size() >= cupoMaximo) {
            throw new CursoException("No hay cupo disponible en el curso");
        }
        alumnoIds.add(alumnoId);
    }

    public void asignarProfesor(String profesorId) {
        this.profesorId = profesorId;

    }

    public void agregarClase(ClaseId claseId) {
        if (claseId == null) {
            throw new CursoException("El claseId no puede ser nulo");
        }
        claseIds.add(claseId);
    }

    public Integer getCursoId() {
        return CursoId;
    }

    public List<AlumnoId> getAlumnoIds() {
        return alumnoIds;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public String getProfesorId() {
        return profesorId;
    }

    public void setProfesorId(String profesorId) {
        this.profesorId = profesorId;
    }

    public Aula getAula() {
        return aula;
    }

    public void setAula(Aula aula) {
        this.aula = aula;
    }
}
