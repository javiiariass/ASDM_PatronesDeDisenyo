/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla;

/**
 *
 * @author javiiariass
 */
public class Circulo implements Figura {

    private String nombre = "circulo generico 1";
    private int coordenadaX;
    private int coordenadaY;
    private int radio;
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String n) {
        nombre = n;
    }

    @Override
    public void mover(int x, int y, int tamanyo) {
        coordenadaX = x;
        coordenadaY = y;
        radio = tamanyo;
    }

    @Override
    public String getPosicion() {
        return "Soy un circulo: " + nombre + " en las coordenadas " + coordenadaX + ", " + coordenadaY + " con un radio de " + radio + '\n';
    }

    @Override
    public Figura clonar() {
        Figura figura = new Circulo();
        figura.setNombre(nombre);
        figura.mover(coordenadaX, coordenadaX, radio);
        return figura;
    }
    
}
