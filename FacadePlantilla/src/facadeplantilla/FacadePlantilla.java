/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package facadeplantilla;
import plantilla.*;
/**
 *
 * @author javiiariass
 */
public class FacadePlantilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


//        I_Clase1 c1= new Clase1();
//        I_Clase2 c2= new Clase2();
//        I_Clase3 c3= new Clase3();
//        
//        c1.operacion1();
//        c2.operacion2();
//        c3.operacion3();
        
        I_Facade facade = new Facade();
        facade.RealizarOperacionFacade();
    
    }
    
}
