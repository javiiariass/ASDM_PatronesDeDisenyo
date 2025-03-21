/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singletonmarcianos;

/**
 *
 * @author javiiariass
 */
public class Marcianos {
    private static final Marcianos marcianos = new Marcianos();
    
    private static int n_marcianos;
    
    private Marcianos(){
        n_marcianos=10;
    }
    
    public static Marcianos getMarcianos(){
        return marcianos;
    }
    
    public static void derriba_marcianos(int derribados){
        
        //si es menor que derribados -> lo asigno a 0 (n_marcianos-n_marcianos)
        n_marcianos -= n_marcianos<derribados ? n_marcianos : derribados;
    
        System.out.println("Has matado a " + derribados + " marcianos");   
        System.out.println("Quedan " + n_marcianos + " marcianos");
    }
    
    public static void crea_marcianos(int creados){
        // Si hay al menos un marciano, le sumo creados
        if(n_marcianos>0)
            n_marcianos+=creados;
        
        System.out.println("Se han creado " + creados + " marcianos");
        System.out.println("Ahora quedan " + n_marcianos + " marcianos");
    }
    
    public static int cuantos_marcianos_quedan(){
        System.out.println("Te contesto: quedan " + n_marcianos + " marcianos");
        return n_marcianos;
    }
        
          
    
}
