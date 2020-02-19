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
public class Marca1 extends Computador{

    public Marca1(){
        ram=4.2;
        cpu=2.3;
    }
    public double calcular_precio() {
        return this.ram*100+110*this.cpu;
    }
    
    
}
