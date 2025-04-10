/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

/**
 *
 * @author javiiariass
 */
public class Lights implements I_Lights{
    
    @Override
    public void On(){
        System.out.println("Enciendo luz");
    }
    
    @Override
    public void Off(){
        System.out.println("Apago luces");
    }
}
