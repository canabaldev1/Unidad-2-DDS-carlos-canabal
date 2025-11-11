package infraestructure.adapter.out.repositories;

import jakarta.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author Victor Garcia
 */

@Entity
@Table(name = "cursos")
public class JpaCursoEntity {
    // implementación del repositorio utilizando Jpa para peristencia de datos
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String asignatura;
    private int cupoMaximo;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    @Column(nullable = true)
    private String aula;
    @Column(nullable = true)
    private String profesorId;

    public JpaCursoEntity() {}

    public JpaCursoEntity(String asignatura, LocalDate fechaInicio, LocalDate fechaFin, int cupoMaximo, String aula, String profesorId) {
        this.asignatura = asignatura;
        this.cupoMaximo = cupoMaximo;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.aula = aula;
        this.profesorId = profesorId;
    }

    //getters
    public int getId() { return id; }
    public String getAsignatura() { return asignatura; }
    public int getCupoMaximo() { return cupoMaximo; }
    public LocalDate getFechaInicio() { return fechaInicio; }
    public LocalDate getFechaFin() { return fechaFin; }
    public String getAula() { return aula; }
    public String getProfesorId() { return profesorId; }
    //setters
    public void setAsignatura( String asignatura ) {
        this.asignatura = asignatura;
    }
    public void setCupoMaximo( int cupoMaximo ) {
        this.cupoMaximo = cupoMaximo;
    }
    public void setFechaInicio( LocalDate fechaInicio ) {
        this.fechaInicio = fechaInicio;
    }
    public void setFechaFin( LocalDate fechaFin ) {
        this.fechaFin = fechaFin;
    }
    public void setAula( String aula ) {
        this.aula = aula;
    }
    public void setProfesorId( String profesorId ) {
        this.profesorId = profesorId;
    }

}
