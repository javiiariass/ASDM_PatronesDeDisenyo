/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory2_plantilla;

/**
 *
 * @author Adrian
 */
public class Producto_concreto_1 extends Producto{
    String Datos_Concreto1="Soy el concreto 1";
    
    public Producto_concreto_1(){
    
    }
    @Override
    public String tipo_Producto(){
    return Datos_Concreto1;
    }
    
    
}
