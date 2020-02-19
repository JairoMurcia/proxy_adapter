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
public class Marca2 extends Computador {
    public Marca2(){
        ram=4.3;
        cpu=2.4;
    }
    @Override
    public double calcular_precio() {
        return ram*120+120*cpu;
    }
    
}
