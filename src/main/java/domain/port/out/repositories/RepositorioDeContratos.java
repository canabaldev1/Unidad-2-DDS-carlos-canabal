/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package domain.port.out.repositories;

import domain.model.profesor.Contrato;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author lm-carlos
 */
public interface RepositorioDeContratos {
    
    // Interfaz que utiliza el adaptador del repositorio
    Contrato guardar(Contrato contrato);
    Optional<Contrato> buscarPorId(String id);
    List<Contrato> listar();
}
