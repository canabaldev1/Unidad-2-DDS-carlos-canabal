/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package domain.events;

import java.time.Instant;

/**
 *
 * @author lm-carlos
 */
public interface EventoDeDominio {

    Instant fecha();
    String id();
}
