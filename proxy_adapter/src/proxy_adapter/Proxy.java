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
public class Proxy extends Computador{

    private Computador c;
    private Monitor m;
   
    @Override
    public double calcular_precio() {
           return c.calcular_precio();
    }
    
    public double calcular_precio(String mo,String co){
        switch(mo){
            case "Monitor1":
                m=new Monitor1();
                break;
            case "Monitor2":
                m=new Monitor2();
                break;
        }
        switch(co){
            case "Marca1":
                c=new Marca1();
            case "Marca2":
                c=new Marca2();
        }
        
        return calcular_precio()+m.precio();
    }
    
    
}
