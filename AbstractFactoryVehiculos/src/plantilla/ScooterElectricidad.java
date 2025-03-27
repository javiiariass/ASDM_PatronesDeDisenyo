package plantilla;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author javiiariass
 */
public class ScooterElectricidad extends Scooter {
    protected String modelo;
    protected String color;
    protected int potencia;

    
    
    public ScooterElectricidad(String m, String c, int p, double e){
        super(m, c, p);
    }
    
    @Override
    public void mostrarCaracteristicas(){
        System.out.println("Scooter electrico\nmodelo: " + modelo + "\ncolor: " + color
        + "\npotencia: " + potencia + "\nsin espacio: ");
    }
}
