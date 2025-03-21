/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton_bd;

/**
 *
 * @author javiiariass
 */
public class ConexionBD {

    public ConexionBD() {
        System.out.println("Conexión a la base de datos establecida");
    }
    
    public void executeQuery(String sql){
        System.out.println("Ejecutando consulta " + sql);
    }
    
}
