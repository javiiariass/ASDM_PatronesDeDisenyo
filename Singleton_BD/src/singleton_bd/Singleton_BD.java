/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package singleton_bd;

/**
 *
 * @author javiiariass
 */
public class Singleton_BD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Base de Datos\n-----------------------");
        ConexionBD db1 = new ConexionBD();
        ConexionBD db2 = new ConexionBD();
        db1.executeQuery("Select * FROM usuarios");
        db2.executeQuery("INSERT INTO productos VALUES ('Laptop',1200)");
    
        
        // operador ternario?
        System.out.println((db1==db2)?"si":"no");
    }
    
}
