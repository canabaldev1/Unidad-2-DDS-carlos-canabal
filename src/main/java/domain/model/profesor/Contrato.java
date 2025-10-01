package domain.model.profesor;

import domain.exceptions.ContratoException;
import domain.valueobjects.profesor.ContratoId;
import domain.valueobjects.profesor.ProfesorId;
import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public class Contrato {

    private final ContratoId id;
    private final ProfesorId profesorId;
    private String cicloAcademico;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private double salario;

    public Contrato(ContratoId id, ProfesorId profesorId, String cicloAcademico, LocalDate fechaInicio, LocalDate fechaFin, double salario) {
        if (profesorId == null) {
            throw new ContratoException("El profesorId no puede ser nulo");
        }
        if (cicloAcademico == null || cicloAcademico.isBlank()) {
            throw new ContratoException("El ciclo académico no puede ser nulo o vacío");
        }
        if (fechaInicio == null || fechaFin == null) {
            throw new ContratoException("Las fechas no pueden ser nulas");
        }
        if (fechaFin.isBefore(fechaInicio)) {
            throw new ContratoException("La fecha fin no puede ser anterior a la fecha inicio");
        }
        if (salario <= 0) {
            throw new ContratoException("El salario debe ser mayor a cero");
        }

        this.id = id;
        this.profesorId = profesorId;
        this.cicloAcademico = cicloAcademico;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;
        this.salario = salario;
    }

    public void actualizarSalario(double nuevoSalario) {
        if (nuevoSalario <= 0) {
            throw new ContratoException("El salario debe ser mayor a cero");
        }
        this.salario = nuevoSalario;
    }

    public ContratoId getId() {
        return id;
    }

    public ProfesorId getProfesorId() {
        return profesorId;
    }

    public String getCicloAcademico() {
        return cicloAcademico;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public double getSalario() {
        return salario;
    }
}
