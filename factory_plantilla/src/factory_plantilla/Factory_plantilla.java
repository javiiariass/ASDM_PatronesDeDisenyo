/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package factory_plantilla;

import java.util.Scanner;

/**
 *
 * @author Adrian
 */
public class Factory_plantilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String tipo;
        Producto p;
        
        Creador miFabricaObjetos;
        
        System.out.println("Que producto desea: ");
        tipo=sc.nextLine();
        miFabricaObjetos=new CreadorConcreto(tipo);
        p=miFabricaObjetos.Factory_Method();
        System.out.println(p.tipo_Producto());
        

    }

}
