package infraestructure.adapter.out.repositories.Matricula;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "matriculas")
public class JpaMatriculaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private int alumnoId;
    @Column(nullable = false)
    private int cursoId;
    @Column(name = "fechaInscripcion", nullable = false)
    private java.time.LocalDate fechaInscripcion;

    public JpaMatriculaEntity() { }

    public JpaMatriculaEntity(int alumnoId, int cursoId, java.time.LocalDate fechaInscripcion) {
        this.alumnoId = alumnoId;
        this.cursoId = cursoId;
        this.fechaInscripcion = fechaInscripcion;
    }

    public int getAlumnoId() {
        return alumnoId;
    }

    public void setAlumnoId(int alumnoId) {
        this.alumnoId = alumnoId;
    }

    public int getCursoId() {
        return cursoId;
    }

    public void setCursoId(int cursoId) {
        this.cursoId = cursoId;
    }

    public LocalDate getFechaInscripcion() {
        return fechaInscripcion;
    }

    public void setFechaInscripcion(LocalDate fechaInscripcion) {
        this.fechaInscripcion = fechaInscripcion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
