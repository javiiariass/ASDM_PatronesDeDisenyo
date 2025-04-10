/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author javiiariass
 */
public class AudioPlayer implements I_AudioPlayer{

    @Override
    public void play() {
        System.out.println("Reproduzco audio: pts pts, pts pts");
    }

    @Override
    public void stop() {
        System.out.println("Paro audio");
    }
    
}
