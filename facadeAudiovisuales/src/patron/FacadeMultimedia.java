/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package patron;
import interfaces.*;
/**
 *
 * @author javiiariass
 */
public class FacadeMultimedia implements I_FacadeMultimedia{
    
    private I_AudioPlayer ap1;
    private I_VideoPlayer vp1;
    private I_Lights l1;

    public FacadeMultimedia() {
        ap1 = new AudioPlayer();
        vp1 = new VideoPlayer();
        l1 = new Lights();
    }
    
    
    
    @Override
    public void playMultimedia(){
        ap1.play();
        vp1.play();
        l1.On();
    }

    @Override
    public void stopMultimedia() {
        ap1.stop();
        vp1.stop();
        l1.Off();
        
    }
}
