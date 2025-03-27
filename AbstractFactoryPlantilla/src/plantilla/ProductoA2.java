package plantilla;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javiiariass
 */
public class ProductoA2 extends ProductoAbstractoA{
    
    public ProductoA2(String modelo, String estilo, int anyo, double precio){
        super(modelo, estilo, anyo,precio);
    }
    
    @Override
    public void mostrarCaracteristicas(){
        System.out.println("Producto tipo A2: " + modelo + " de estilo " + estilo + 
                " del año " + anyo + " sin precio");
    }
}
