/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Plantilla;

/**
 *
 * @author javiiariass
 */
public class CreadorConcreto extends Creador{
    
    int tipo;
    private Figura f;
    
    // Si se ha elegido crear clon, hay que ver si se ha creado uno original antes
    private boolean circulo;
    private boolean cuadrado;


    public CreadorConcreto(){
        circulo = false;
        cuadrado = false;
        f = null;
    }
    
    
    @Override
    public Figura factoryMethod(int t){
        tipo = t;
        if(tipo==1){
            f = new Circulo();
            circulo = true;
            return f;
        }
        else if(tipo==2 && circulo){
            return f.clonar();
        }
        else if(tipo==3){
            f = new Cuadrado();
            cuadrado = true;
            return f;
        }
        else if(tipo==4 && cuadrado){
            return f.clonar();
        }
        else
            System.out.println("No puedes crear un clon sin original");
            
        return null;
    }
    
    
    
    
}
