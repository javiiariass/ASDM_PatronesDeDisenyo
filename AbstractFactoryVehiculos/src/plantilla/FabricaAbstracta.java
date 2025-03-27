/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package plantilla;

/**
 *
 * @author javiiariass
 */
public interface FabricaAbstracta {
    Automovil CreaProductoAbstractoAuto(String m, String c, int p, double e);
    Scooter CreaProductoAbstractoScooter(String m, String c, int p);
}
