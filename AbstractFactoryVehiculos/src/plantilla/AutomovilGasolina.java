package plantilla;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javiiariass
 */
public class AutomovilGasolina extends Automovil {
    protected String modelo;
    protected String color;
    protected int potencia;
    protected double espacio; // capacidad del coche
    
    
    public AutomovilGasolina(String m, String c, int p, double e){
        super(m, c, p, e);
    }
    
    @Override
    public void mostrarCaracteristicas(){
        System.out.println("Autmovil gasolina\nmodelo: " + modelo + "\ncolor: " + color
        + "\npotencia: " + potencia + "\nespacio: " + espacio);
    }
}
