/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadeaudiovisuales;
import patron.*;
/**
 *
 * @author javiiariass
 */
public class FacadeAudiovisuales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        I_FacadeMultimedia facade = new FacadeMultimedia();
        facade.playMultimedia();
        
        facade.stopMultimedia();
    }
    
}
