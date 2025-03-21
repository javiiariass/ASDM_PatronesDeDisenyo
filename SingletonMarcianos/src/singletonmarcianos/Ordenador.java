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
public class Ordenador {
    Marcianos marcianos;

    public Ordenador() {
        marcianos = Marcianos.getMarcianos();         
    }
    
    public void nuevos_marcianos(){
        Random rnd = new Random(System.currentTimeMillis());
        marcianos.crea_marcianos(rnd.nextInt(10));
    }
    
    
}
