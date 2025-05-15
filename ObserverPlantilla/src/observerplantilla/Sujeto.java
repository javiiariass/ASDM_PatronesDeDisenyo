/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package observerplantilla;

/**
 *
 * @author javiiariass
 */
public interface Sujeto {
    // suscribirse a observador
    public void registrarObservador(Observador o);
    
    // desuscribirse a observador
    public void retirarObservador(Observador o);
    
    public void ejecutaAccion(String accion, String lugar);
    public void notifica();
}
