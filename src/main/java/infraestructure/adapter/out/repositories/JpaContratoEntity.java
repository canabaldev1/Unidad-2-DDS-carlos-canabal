package infraestructure.adapter.out.repositories;

import domain.valueobjects.profesor.ContratoId;
import domain.valueobjects.profesor.ProfesorId;
import jakarta.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
@Entity
@Table(name = "contratos")
public class JpaContratoEntity {

    @Id
    @Column(name = "contrato_id")  // Primary key, no ID autoincremental
    private String contratoId;  // ID del dominio (UUID)

    @Column(name = "profesor_id", nullable = false)
    private String profesorId;  // ID del profesor (UUID)

    @Column(name = "numero", nullable = false)
    private String numero;

    @Column(name = "ciclo_academico", nullable = false)
    private String cicloAcademico;

    @Column(name = "fecha_inicio", nullable = false)
    private LocalDate fechaInicio;

    @Column(name = "fecha_fin", nullable = false)
    private LocalDate fechaFin;

    @Column(name = "salario", nullable = false)
    private double salario;

    public JpaContratoEntity() {

    }

    public JpaContratoEntity(String contratoId, String profesorId, String numero, String cicloAcademico,
            LocalDate fechaInicio, LocalDate fechaFin, double salario) {
        this.contratoId = contratoId;
        this.profesorId = profesorId;
        this.numero = numero;
        this.cicloAcademico = cicloAcademico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.salario = salario;
    }

    // Método para obtener el ID como Value Object (igual que en Profesor)
    public ContratoId getId() {
        return new ContratoId(contratoId);
    }

    public ProfesorId getProfesorId() {
        return new ProfesorId(profesorId);
    }

    // Getters y Setters
    public String getContratoId() {
        return contratoId;
    }

    public void setContratoId(String contratoId) {
        this.contratoId = contratoId;
    }

    public String getProfesorIdString() {
        return profesorId;
    }

    public void setProfesorId(String profesorId) {
        this.profesorId = profesorId;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCicloAcademico() {
        return cicloAcademico;
    }

    public void setCicloAcademico(String cicloAcademico) {
        this.cicloAcademico = cicloAcademico;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
