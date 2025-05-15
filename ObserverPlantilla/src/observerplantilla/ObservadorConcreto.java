/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerplantilla;

/**
 *
 * @author javiiariass
 */
public class ObservadorConcreto implements Observador {

    @Override
    public void actualizar(String accion, String lugar) {
        System.out.println("Soy un observador, oido accion " + accion + " en lugar " + lugar );
    }
    
    
}
