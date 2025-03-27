package plantilla;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javiiariass
 */
public abstract class Automovil {
    protected String modelo;
    protected String color;
    protected int potencia;
    protected double espacio; // capacidad del coche
    
    
    public Automovil(String m, String c, int p, double e){
        this.modelo = m;
        this.color = c;
        this.potencia = p;
        this.espacio = e;
    }
    
    public abstract void mostrarCaracteristicas();
}
