/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pascu
 */
public class RestauranteDavid {
    
    public int p;
    public int c;

    public RestauranteDavid(int a, int b) {
        this.p = a;
        this.c = b;
    }
    
    int cantidadEnsaladas(){
        int a = p * 3;
        return a;
    }
           
    int cantidadPizzas(){
        int ch = c * 6;
        return ch;
    }
    
    public void addPizzas(int c){
        this.c = this.c + c;
    }
    
    public void addEnsaladas(int d){
        this.p = this.p + d;
    }
    
    
}
