package plantilla;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javiiariass
 */
public abstract class ProductoAbstractoA {
    protected String modelo ;
    protected String estilo;
    protected  int anyo;
    protected double precio;
    

    
    public ProductoAbstractoA(String modelo, String estilo, int anyo, double precio){
        this.modelo = modelo;
        this.estilo = estilo;
        this.anyo = anyo;
        this.precio = precio;
    }
    
    public abstract void mostrarCaracteristicas();
}
