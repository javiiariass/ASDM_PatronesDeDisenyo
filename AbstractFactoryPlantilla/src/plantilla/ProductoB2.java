package plantilla;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javiiariass
 */
public class ProductoB2 extends ProductoAbstractoB{
    
    public ProductoB2(String modelo, String estilo, int anyo, double precio){
        super(modelo, estilo, anyo,precio);
    }
    
    @Override
    public void mostrarCaracteristicas(){
        System.out.println("Producto tipo B2: " + modelo + "de estilo " + estilo + 
                " del año " + anyo + " con precio " + precio + " millones");
    }
}
