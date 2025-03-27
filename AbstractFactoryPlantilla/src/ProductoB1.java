/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javiiariass
 */
public class ProductoB1 extends ProductoAbstractoB{
    
    public ProductoB1(String modelo, String estilo, int anyo, double precio){
        super(modelo, estilo, anyo,precio);
    }
    
    @Override
    public void mostrarCaracteristicas(){
        System.out.println("Producto tipo B1: " + modelo + "de estilo " + estilo + 
                " del año " + anyo + " con precio " + precio + " millones");
    }
}
