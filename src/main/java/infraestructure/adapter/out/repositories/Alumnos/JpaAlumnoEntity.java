package infraestructure.adapter.out.repositories.Alumnos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "alumnos")
public class JpaAlumnoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nombre;
    private String apellido;
    @Column(name = "fechanacimiento")
    private LocalDate fechaNacimiento;
    @Column(nullable = true)
    private String telefono;
    @Column(nullable = true)
    private String email;
    private String direccion;

    public JpaAlumnoEntity() {}

    public JpaAlumnoEntity(String nombre, String apellido, LocalDate fechaNacimiento, String telefono, String email, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.email = email;
        this.direccion = direccion;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
