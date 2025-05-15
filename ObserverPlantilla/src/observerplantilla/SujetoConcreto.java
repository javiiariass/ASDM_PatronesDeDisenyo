/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observerplantilla;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author javiiariass
 */
public class SujetoConcreto implements Sujeto {

    private ArrayList<Observador> observadores;
    private String accion;
    private String lugar;

    public SujetoConcreto() {
        observadores = new ArrayList<>();
    }
    
    // opcional, poder tener un constructor al que pasarle una lista de observadores
    /*
    public SujetoConcreto(ArrayList<Observador> observadores) {
        this.observadores = observadores;
    }
    /**/
    
    
    @Override
    public void registrarObservador(Observador o) {
        observadores.add(o);
    }

    @Override
    public void retirarObservador(Observador o) {
        observadores.remove(o);
    }

    @Override
    public void ejecutaAccion(String accion, String lugar) {
        
        this.accion = accion;
        this.lugar = lugar;
        
        notifica();
    }

    @Override
    public void notifica() {
        
        // Actualizamos todos los observadores
        for(Observador o: observadores){
            o.actualizar(this.accion, this.lugar);
        }
    }
    
}
