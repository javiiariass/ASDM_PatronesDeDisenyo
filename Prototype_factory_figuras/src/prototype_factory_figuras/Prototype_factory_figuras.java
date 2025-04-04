/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prototype_factory_figuras;

import Plantilla.*;
import java.util.Scanner;

/**
 *
 * @author javiiariass
 */
public class Prototype_factory_figuras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // escaner
        Scanner sc = new Scanner(System.in);
        Scanner scInteger = new Scanner(System.in);
      
        // variables
        int opcion, posX,posY,tamanyo;  
        String nombre;
        
        Figura figura;
        Figura clon;
        Creador miFabrica;
        miFabrica = new CreadorConcreto();
        
        do {            
            System.out.println("""
                               ¿Qué quiere crear?
                               1. Circulo
                               2. Clon circulo
                               3. Cuadrado
                               4. Clon cuadrado
                               5. Salir
                               """);
            opcion = sc.nextInt();
            switch (opcion) {
                // opciones en las que creo circulo o cuadrado
                case 1:
                case 3:
                    figura = miFabrica.factoryMethod(opcion);
                    
                    System.out.println("Incique el nombre: ");
                    nombre = sc.nextLine();
                    figura.setNombre(nombre);
                    
                    System.out.println("Indique coordenada X: ");
                    posX = scInteger.nextInt();
                    System.out.println("Indique coordenada Y: ");
                    posY = scInteger.nextInt();
                    System.out.println("Indique el tamaño: ");
                    tamanyo = scInteger.nextInt();
                    
                    figura.mover(posX, posY, tamanyo);
                    break;
                case 2:
                case 4:
                    clon = miFabrica.factoryMethod(opcion);
                    break;
                case 5:
                    figura = null;
                    break;
                default:
                    figura = null;
                    System.out.println("Opcion incorrecta");
            }
            if(figura!=null)
                System.out.println("soy figura tal con nombre tal y pos tal");
        } while (opcion!=5);
    }
    
}
