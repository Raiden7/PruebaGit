/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pascu
 */
public class main {
    
    //cambio para github
    //cambio en el brach pruebas 2
    public static void main(String[] args){
        RestauranteDavid r1 = new RestauranteDavid(50, 60);
        System.out.println("Numero de Pizzas " + r1.c);
        System.out.println("Numero de Ensaladas " + r1.p);
        
        if (r1.cantidadPizzas() <= r1.cantidadEnsaladas()){
            System.out.println("El cocinero puede dar de comer a  " + r1.cantidadPizzas() + " personas");
        }else {
             System.out.println("El cocinero puede dar de comer a  " + r1.cantidadEnsaladas()+ " personas");
        }
           
        r1.addEnsaladas(20);
        r1.addPizzas(10);
        System.out.println("Numero de Pizzas " + r1.c);
        System.out.println("Numero de Ensaladas " + r1.p);
            
        
        if (r1.cantidadPizzas() <= r1.cantidadEnsaladas()){
            System.out.println("El cocinero puede dar de comer a  " + r1.cantidadPizzas() + " personas");
        }else {
             System.out.println("El cocinero puede dar de comer a  " + r1.cantidadEnsaladas()+ " personas");
        }
           
    }
}
