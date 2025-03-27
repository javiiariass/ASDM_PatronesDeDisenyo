package plantilla;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javiiariass
 */
public abstract class Scooter {
    protected String modelo;
    protected String color;
    protected int potencia;

    
    
    public Scooter(String m, String c, int p){
        this.modelo = m;
        this.color = c;
        this.potencia = p;

    }
    
    public abstract void mostrarCaracteristicas();
}
