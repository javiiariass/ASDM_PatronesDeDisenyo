/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototype;

import Plantilla.PrototipoConcreto1;
import Plantilla.PrototipoConcreto2;
import Plantilla.Prototype;

/**
 *
 * @author javiiariass
 */
public class Main_Prototype {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Prototype p1 = new PrototipoConcreto1();
        Prototype p2 = new PrototipoConcreto2();

        Prototype clon1;
        Prototype clon2;

        clon1 = p1.clonar();
        clon2 = p2.clonar();
        
        System.out.println("Clon del prototipo 1");
        System.out.println(p1.getNombre());
        System.out.println(clon1.getNombre());
        
        clon1.setNombre("Clon 1");
        System.out.println("Clon del prototipo 1 modificado");
        System.out.println(p1.getNombre());
        System.out.println(clon1.getNombre());
        
        clon2=clon1.clonar();
        System.out.println("Datos del clon 2");
        System.out.println(clon1.getNombre());
        System.out.println(clon2.getNombre());
        
    }

}
