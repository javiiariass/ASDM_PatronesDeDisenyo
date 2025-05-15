/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package observerplantilla;

import java.util.Scanner;

/**
 *
 * @author javiiariass
 */
public class ObserverPlantilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sujeto sujeto;
        Observador observador1;
        Observador observador2;
        String accion;
        String lugar;
        
        Scanner sc = new Scanner(System.in);
        
        sujeto = new SujetoConcreto();
        observador1 = new ObservadorConcreto();
        observador2 = new ObservadorConcreto();
        
        System.out.println("Registrar observadores\n------------------");
        sujeto.registrarObservador(observador1);
        sujeto.registrarObservador(observador2);
        
        System.out.print("\nIndicamos accion: ");
        accion = sc.nextLine();
        System.out.print("\nIndicamos lugar: ");
        lugar = sc.nextLine();
        
        sujeto.ejecutaAccion(accion, lugar);
        
        
    }
    
}
