package domain.model.alumno;

import domain.exceptions.AlumnoException;
import domain.valueobjects.alumno.AlumnoId;
import domain.valueobjects.shared.DatosContacto;
import domain.valueobjects.shared.DatosPersonales;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lm-carlos
 */
public class Alumno {
    private Integer id;
    private String nombre;
    private String apellido;
    private LocalDate fechaNacimiento;
    private String telefono;

    public Integer getId() {
        return id;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    private String email;
    private String direccion;
    private List<Matricula> matriculas;
    private List<AsignacionServicio> serviciosComplementarios;

    public Alumno(Integer id ,String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String email, String direccion) {
        if (nombre == null || nombre.isBlank()) {
            throw new AlumnoException("El nombre no puede estar vacío");
        }
        if (apellido == null || apellido.isBlank()) {
            throw new AlumnoException("El apellido no puede estar vacío");
        }
        if (fechaNacimiento == null) {
            throw new AlumnoException("La fecha de nacimiento no puede ser nula");
        }
        if (telefono == null || telefono.isBlank()) {
            throw new AlumnoException("El teléfono no puede estar vacío");
        }
        if (email == null || email.isBlank()) {
            throw new AlumnoException("El email no puede estar vacío");
        }
        if (direccion == null || direccion.isBlank()) {
            throw new AlumnoException("La dirección no puede estar vacía");
        }

        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
        this.matriculas = new ArrayList<>();
        this.serviciosComplementarios = new ArrayList<>();
    }

    public void agregarMatricula(Matricula matricula) {
        if (matricula == null) {
            throw new AlumnoException("La matrícula no puede ser nula");
        }
        this.matriculas.add(matricula);
    }

    public void asignarServicio(AsignacionServicio servicio) {
        if (servicio == null) {
            throw new AlumnoException("El servicio no puede ser nulo");
        }
        this.serviciosComplementarios.add(servicio);
    }
}
