package infraestructure.adapter.out.repositories;

import domain.model.profesor.Profesor;
import domain.port.out.repositories.RepositorioDeProfesores;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author lm-carlos
 */
public class MongoRepositorioDeProfesores implements RepositorioDeProfesores {

    @Override
    public Profesor guardar(Profesor profesor) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Profesor> buscarPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Profesor> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // implementacion del repositorio utilizando MongoDB para peristencia de datos

}
