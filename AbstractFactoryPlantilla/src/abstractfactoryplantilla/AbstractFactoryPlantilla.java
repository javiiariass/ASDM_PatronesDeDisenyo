/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package abstractfactoryplantilla;
import plantilla.*;
import java.util.Scanner;

/**
 *
 * @author javiiariass
 */
public class AbstractFactoryPlantilla {
    public static int nProductosB=3;
    public static int nProductosA=3;
    
    
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Scanner reader2 = new Scanner(System.in);
        FabricaAbstracta fabrica;
        int eleccion;
        String modelo, estilo;
        int anyo;
        double precio;
        
        ProductoAbstractoB[] productosB = new ProductoAbstractoB[nProductosB];
        ProductoAbstractoA[] productosA = new ProductoAbstractoA[nProductosA];
        
        System.out.println("Desea productos de tipo 1 o 2? : ");
        eleccion = reader.nextInt();
        
        
        // operador ternario -> misma wea que if-else
        fabrica =(eleccion == 1)? new FabricaConcreta1() : new FabricaConcreta2();
        
        for (int i = 0; i < nProductosB; i++) {
            System.out.println("Productos tipo B " + i);
            System.out.println("Introduzca el modelo: ");
            modelo = reader2.nextLine();
            System.out.println("Introduzca el estilo: ");
            estilo = reader2.nextLine();
            System.out.println("Introduzca el año: ");
            anyo = reader.nextInt();
            System.out.println("Introduzca el precio: ");
            precio = reader.nextDouble();
            productosB[i] = fabrica.creaProductoB(modelo, estilo, anyo, precio);
        }
        
        for (int i = 0; i < nProductosA; i++) {
            System.out.println("Productos tipo B " + i);
            System.out.println("Introduzca el modelo: ");
            modelo = reader2.nextLine();
            System.out.println("Introduzca el estilo: ");
            estilo = reader2.nextLine();
            System.out.println("Introduzca el año: ");
            anyo = reader.nextInt();
            productosA[i] = fabrica.creaProductoA(modelo, estilo, anyo);
        }
        
        
        System.out.println("Mostramos caracteristicas ");
        for(ProductoAbstractoB producB : productosB ){
            producB.mostrarCaracteristicas();
        }
        
        for(ProductoAbstractoA producA : productosA ){
            producA.mostrarCaracteristicas();
        }
                
    }
    
}
