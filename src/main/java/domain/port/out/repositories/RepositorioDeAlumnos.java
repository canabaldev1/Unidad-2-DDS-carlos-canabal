/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package domain.port.out.repositories;

import domain.model.alumno.Alumno;

import java.util.List;
import java.util.Optional;

/**
 *
 * @author Victor Garcia
 */
public interface RepositorioDeAlumnos {
    Alumno guardar(Alumno alumno);
    Optional<Alumno> buscarPorId(Integer id);
    List<Alumno> listar();
}
