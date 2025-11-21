package infraestructure.adapter.out.repositories;

import domain.model.profesor.Contrato;
import domain.port.out.repositories.RepositorioDeContratos;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author lm-carlos
 */
public class MongoRepositorioDeContratos implements RepositorioDeContratos {

    @Override
    public Contrato guardar(Contrato contrato) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Optional<Contrato> buscarPorId(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<Contrato> listar() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    // implementacion del repositorio utilizando MongoDB para peristencia de datos

}
