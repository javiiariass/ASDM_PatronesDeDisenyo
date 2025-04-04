/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla;

/**
 *
 * @author javiiariass
 */
public class PrototipoConcreto2 implements Prototype{

    private String nombre; //= "Prototipo 1"; // si queremos cambiarlo, iniciarlo en ctor
    
    public PrototipoConcreto2(){
        this.nombre = "Prototipo 2";
    }
    
    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public void setNombre(String n) {
        nombre = n;
    }

    @Override
    public Prototype clonar() {
        Prototype prototipo = new PrototipoConcreto2();
        prototipo.setNombre(nombre);
        return prototipo;
    }
    
}
