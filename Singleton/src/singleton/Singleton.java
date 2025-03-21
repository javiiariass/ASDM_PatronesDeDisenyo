/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton;

/**
 *
 * @author javiiariass
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MiSingleton s1=MiSingleton.obtenerSingleton();
        MiSingleton s2=MiSingleton.obtenerSingleton();
        MiSingleton s3=MiSingleton.obtenerSingleton();
        MiSingleton s4=MiSingleton.obtenerSingleton();
        MiSingleton s5=MiSingleton.obtenerSingleton();
        MiSingleton s6=MiSingleton.obtenerSingleton();
        
        
        s3.vecesLlamado();
        s4.vecesLlamado();
    }
    
}
