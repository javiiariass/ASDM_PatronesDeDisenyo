/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory_plantilla;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class CreadorConcreto extends Creador{
    private String tipo;
    public CreadorConcreto(String t){
    tipo=t;
    }
    @Override
    public Producto Factory_Method(){
        System.out.println("Sacamos un objeto desde la fabrica");
        Scanner sc=new Scanner(System.in);
        if(tipo.equalsIgnoreCase("Tipo 1"))
            return new Producto_concreto_1();
        else
            return new Producto_concreto_2();
        
    }
    
}
