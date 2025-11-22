/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package domain.port.out.repositories;

import domain.model.alumno.Matricula;

import java.util.List;
import java.util.Optional;
/**
 *
 * @author lm-carlos
 */
public interface RepositorioDeMatriculas {
    Matricula guardar (Matricula matricula);
    Optional<Matricula> buscarPorId(String id);
    List<Matricula> listar();
}
