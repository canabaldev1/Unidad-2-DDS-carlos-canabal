package infraestructure.adapter.out.repositories;

import domain.model.profesor.Profesor;
import domain.port.out.repositories.RepositorioDeProfesores;
import domain.valueobjects.profesor.ProfesorId;
import domain.valueobjects.shared.DatosPersonales;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import org.springframework.stereotype.Repository;

/**
 *
 * @author lm-carlos
 */
@Repository
public class JpaRepositorioDeProfesores implements RepositorioDeProfesores {

    private final SpringDataProfesorRepository springRepo;

    public JpaRepositorioDeProfesores(SpringDataProfesorRepository springRepo) {
        this.springRepo = springRepo;
    }

    @Override
    public Profesor guardar(Profesor profesor) {
        JpaProfesorEntity entity = new JpaProfesorEntity(
            profesor.getId().getValue(),
            profesor.getDatosPersonales().getNombres(),
            profesor.getDatosPersonales().getApellidos(),
            profesor.getDatosPersonales().getFechaNacimiento(),
            profesor.getEspecialidad()
        );
        springRepo.save(entity);
        return profesor;
    }

    @Override
    public Optional<Profesor> buscarPorId(String id) {
        return springRepo.findById(id)
                .map(entity -> new Profesor(
                    entity.getId(),
                    new DatosPersonales(
                        entity.getNombre(),
                        entity.getApellido(),
                        entity.getFechaNacimiento()
                    ),
                    entity.getEspecialidad()
                ));
    }

    @Override
    public List<Profesor> listar() {
        return springRepo.findAll().stream()
                .map(this::toDomain)
                .collect(Collectors.toList());
    }

    // MAPEO
    
    private Profesor toDomain(JpaProfesorEntity entity) {
        // Crear DatosPersonales con los datos de la entity
        DatosPersonales datosPersonales = new DatosPersonales(
                entity.getNombre(),
                entity.getApellido(),
                entity.getFechaNacimiento()
        );

        // Crear ProfesorId con el ID de la entity (que ya es String)
        ProfesorId profesorId = entity.getId();

        // Crear y retornar Profesor de dominio
        return new Profesor(profesorId, datosPersonales, entity.getEspecialidad());
    }

    private JpaProfesorEntity toEntity(Profesor profesor) {
        DatosPersonales datos = profesor.getDatosPersonales();

        return new JpaProfesorEntity(
                profesor.getId().getValue(), // profesorId (String/UUID)
                datos.getNombres(), // nombre
                datos.getApellidos(), // apellido  
                datos.getFechaNacimiento(), // fechaNacimiento
                profesor.getEspecialidad() // especialidad
        );
    }
}
