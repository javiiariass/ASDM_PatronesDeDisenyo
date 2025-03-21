/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author javiiariass
 */
public final class MiSingleton {
    private static final MiSingleton singleton=new MiSingleton();
    private static int cantidad;
    
    
    // Constructor privado para  que no se pueda instanciar
    private MiSingleton(){
        cantidad=0;
    }
    
    public static MiSingleton obtenerSingleton(){
        cantidad++;
        return singleton;
    }
    
    public static void vecesLlamado(){
        System.out.println("Me has llamado " + cantidad + " veces");
        
    }
}
