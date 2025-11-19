package infraestructure.adapter.out.repositories;

import domain.valueobjects.profesor.ProfesorId;
import jakarta.persistence.*;
import java.time.LocalDate;

/**
 *
 * @author lm-carlos
 */
@Entity
@Table(name = "profesores")
public class JpaProfesorEntity {

    @Id
    @Column(name = "profesor_id")  // Esta es la primary key, no usamos ID autoincremental
    private String profesorId;  // ID del dominio (UUID)

    @Column(name = "nombre", nullable = false)
    private String nombre;

    @Column(name = "apellido", nullable = false)
    private String apellido;

    @Column(name = "fecha_nacimiento")
    private LocalDate fechaNacimiento;

    @Column(name = "especialidad", nullable = false)
    private String especialidad;

    // Constructores
    public JpaProfesorEntity() {
    }

    public JpaProfesorEntity(String profesorId, String nombre, String apellido,
            LocalDate fechaNacimiento, String especialidad) {
        this.profesorId = profesorId;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
        this.especialidad = especialidad;
    }
    
    public ProfesorId getId(){
        return new ProfesorId(profesorId);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
