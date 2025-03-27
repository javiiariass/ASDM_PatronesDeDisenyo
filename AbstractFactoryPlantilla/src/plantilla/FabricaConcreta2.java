package plantilla;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author javiiariass
 */
public class FabricaConcreta2 implements FabricaAbstracta {

    @Override
    public ProductoAbstractoB creaProductoB(String m, String e, int a, double p) {
        return new ProductoB2(e, e, a, p);
    }

    @Override
    public ProductoAbstractoA creaProductoA(String m, String e, int a) {
        return new ProductoA2(e, e, a, a);
    }
}
