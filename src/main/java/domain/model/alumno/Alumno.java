package domain.model.alumno;

import domain.exceptions.AlumnoException;
import domain.valueobjects.alumno.AlumnoId;
import domain.valueobjects.shared.DatosContacto;
import domain.valueobjects.shared.DatosPersonales;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lm-carlos
 */
public class Alumno {

 private final AlumnoId id;
    private DatosPersonales datosPersonales;
    private DatosContacto datosContacto;
    private List<Matricula> matriculas;
    private List<AsignacionServicio> serviciosComplementarios;

    public Alumno(AlumnoId id, DatosPersonales datosPersonales, DatosContacto datosContacto) {
        if (datosPersonales == null) throw new AlumnoException("Datos personales no pueden ser nulos");
        if (datosContacto == null) throw new AlumnoException("Datos de contacto no pueden ser nulos");
        this.id = id;
        this.datosPersonales = datosPersonales;
        this.datosContacto = datosContacto;
        this.matriculas = new ArrayList<>();
        this.serviciosComplementarios = new ArrayList<>();
    }

    public AlumnoId getId() { return id; }

    public void actualizarDatosContacto(DatosContacto nuevoContacto) {
        if (nuevoContacto == null) throw new AlumnoException("El contacto no puede ser nulo");
        this.datosContacto = nuevoContacto;
    }

    public void agregarMatricula(Matricula matricula) {
        if (matricula == null) throw new AlumnoException("La matrícula no puede ser nula");
        this.matriculas.add(matricula);
    }

    public void asignarServicio(AsignacionServicio servicio) {
        if (servicio == null) throw new AlumnoException("El servicio no puede ser nulo");
        this.serviciosComplementarios.add(servicio);
    }
}
