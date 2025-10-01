/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Record.java to edit this template
 */
package domain.events;

import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public record AlumnoAsignado(String alumnoId, Instant fecha) implements EventoDeDominio {

    @Override

    public String id() {
        return alumnoId;
    }
}
