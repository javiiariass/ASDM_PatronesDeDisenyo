/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package plantilla;

/**
 *
 * @author javiiariass
 */
public class Facade implements I_Facade{

    private I_Clase1 c1;
    private I_Clase2 c2;
    private I_Clase3 c3;

    public Facade() {
        c1=new Clase1();
        c2=new Clase2();
        c3=new Clase3();
    }
    
    
    
    @Override
    public void RealizarOperacionFacade() {
        System.out.println("Operaciones de clase desde Facade");
        System.out.println("Realizo las adaptaciones previas pertinentes");
        //llamadas
        c1.operacion1();
        c2.operacion2();
        c3.operacion3();
        
        System.out.println("Realizo las adaptaciones posteriores pertinentes");
    }
    
}
