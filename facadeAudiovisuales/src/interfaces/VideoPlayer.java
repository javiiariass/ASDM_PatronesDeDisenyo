/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author javiiariass
 */
public class VideoPlayer implements I_VideoPlayer{

    @Override
    public void play() {
        System.out.println("Reproduzco video: *rubius jugando mincraft*");
    }

    @Override
    public void stop() {
        System.out.println("Paro video :(");
    }
    
}
