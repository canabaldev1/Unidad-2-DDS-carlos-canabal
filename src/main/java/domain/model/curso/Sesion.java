package domain.model.curso;

import domain.exceptions.SesionException;
import domain.valueobjects.curso.ClaseId;
import domain.valueobjects.curso.SesionId;
import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
public class Sesion {

    private final SesionId id;
    private final ClaseId claseId;
    private LocalDate fechaEspecifica;
    private String temaDelDia;

    public Sesion(SesionId id, ClaseId claseId, LocalDate fechaEspecifica, String temaDelDia) {
        if (claseId == null) {
            throw new SesionException("El claseId no puede ser nulo");
        }
        if (fechaEspecifica == null) {
            throw new SesionException("La fecha no puede ser nula");
        }
        if (temaDelDia == null || temaDelDia.isBlank()) {
            throw new SesionException("El tema del día no puede ser nulo o vacío");
        }

        this.id = id;
        this.claseId = claseId;
        this.fechaEspecifica = fechaEspecifica;
        this.temaDelDia = temaDelDia;
    }

    public void actualizarTema(String nuevoTema) {
        if (nuevoTema == null || nuevoTema.isBlank()) {
            throw new SesionException("El tema no puede ser nulo o vacío");
        }
        this.temaDelDia = nuevoTema;
    }

    public SesionId getId() {
        return id;
    }
}
