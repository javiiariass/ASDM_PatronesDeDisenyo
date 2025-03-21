/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singletonmarcianos;

import java.util.Scanner;

/**
 *
 * @author javiiariass
 */
public class SingletonMarcianos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int disparos;
        Scanner ac = new Scanner(System.in);
        Marcianos marcianos = Marcianos.getMarcianos();
        Ordenador ordenador = new Ordenador();
        
        Jugador jugador = new Jugador();
        
        System.out.println("Comenzamos el juego");
        
        do{
            System.out.println("Cuantos disparos");
            disparos=ac.nextInt();
            jugador.destruir_marcianos(disparos);
            ordenador.nuevos_marcianos();
            
        }while(disparos != 0  && (marcianos.cuantos_marcianos_quedan() > 0));
    }
    
}
