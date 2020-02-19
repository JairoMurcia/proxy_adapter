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
public class Monitor2 extends Monitor{
    public Monitor2(){
        resolucion=450;
    }

    @Override
    public double precio() {
        return resolucion*110;
    }
}
