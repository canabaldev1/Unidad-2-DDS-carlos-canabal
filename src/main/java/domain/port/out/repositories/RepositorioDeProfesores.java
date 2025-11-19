/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package domain.port.out.repositories;

import domain.model.profesor.Profesor;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author lm-carlos
 */
public interface RepositorioDeProfesores {

    // Interfaz que utiliza el adaptador del repositorio
    Profesor guardar(Profesor profesor);
    Optional<Profesor> buscarPorId(String id);
    List<Profesor> listar();
}
