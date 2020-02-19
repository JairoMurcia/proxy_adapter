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
public class Monitor1 extends Monitor{
    
    public Monitor1(){
        resolucion=1080;
    }

    
    public double precio() {
       return resolucion*250; 
    }
    
}
