/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy_adapter;

/**
 *
 * @author jairo
 */
public class Proxy_adapter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Proxy p=new Proxy();
        
        System.out.println("precio: "+p.calcular_precio("Monitor1", "Marca1"));
        System.out.println("precio: "+p.calcular_precio("Monitor1", "Marca2"));
        System.out.println("precio: "+p.calcular_precio("Monitor2", "Marca1"));
        System.out.println("precio: "+p.calcular_precio("Monitor2", "Marca2"));
        
    }
    
}
