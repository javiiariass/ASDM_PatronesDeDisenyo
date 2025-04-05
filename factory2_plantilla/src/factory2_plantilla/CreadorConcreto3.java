/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory2_plantilla;

/**
 *
 * @author Adrian
 */
public class CreadorConcreto3 extends Creador{
    private String tipo="Tipo 2";
    public CreadorConcreto3() {
    }
    
      @Override
    public Producto Factory_Method(){
        System.out.println("Vamos a crear un objeto desde la fabrica 2");
        return new Producto_concreto_2();
    }
}
