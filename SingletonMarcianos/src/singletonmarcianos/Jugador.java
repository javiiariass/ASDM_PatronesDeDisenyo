/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonmarcianos;

import java.util.Random;


/**
 *
 * @author javiiariass
 */
public class Jugador {

    private Marcianos marcianos;
    
    public Jugador() {
        marcianos = Marcianos.getMarcianos();
    }

    public void destruir_marcianos(int derribados){
        Random rnd = new Random(System.currentTimeMillis());
        
        marcianos.derriba_marcianos(rnd.nextInt(derribados));
    
    }
    
}

