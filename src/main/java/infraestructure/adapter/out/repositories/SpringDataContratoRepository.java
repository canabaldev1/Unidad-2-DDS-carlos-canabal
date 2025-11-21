/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package infraestructure.adapter.out.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author lm-carlos
 */
public interface SpringDataContratoRepository extends JpaRepository<JpaContratoEntity, String> {
    
}
