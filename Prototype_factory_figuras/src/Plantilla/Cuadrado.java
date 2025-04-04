/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla;

/**
 *
 * @author javiiariass
 */
public class Cuadrado implements Figura {

    private String nombre= "Cuadrado generico 1";
    private int coordenadaX;
    private int coordenadaY;
    private int lado;
    
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
        lado = tamanyo;
    }

    @Override
    public String getPosicion() {
        return "Soy un cuadrado: " + nombre + " en las coordenadas " + coordenadaX + ", " + coordenadaY + " con un lado de " + lado + '\n';
    }

    @Override
    public Figura clonar() {
        Figura figura = new Cuadrado();
        figura.setNombre(nombre);
        figura.mover(coordenadaX, coordenadaX, lado);
        return figura;
    }
    
}
