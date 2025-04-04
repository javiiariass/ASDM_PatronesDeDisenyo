/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Plantilla;

/**
 *
 * @author javiiariass
 */
public interface Figura {
   public String getNombre();
   public void setNombre(String n);
   public void mover(int x, int y, int tamanyo);
   public String getPosicion();
   public Figura clonar();
   
   
}
