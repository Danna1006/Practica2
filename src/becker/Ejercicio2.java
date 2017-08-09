/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;

import becker.robots.*;
/**
 *
 * @author DANNA
 */
public class Ejercicio2 {
 
    
    public static void girarDerecha (Robot karel, int a){
       for (int i = 1; i <= a; i++){
           karel.turnLeft();
       }
   }
    
    public static void movimiento (Robot karel, int a){
       for (int i = 1; i <= a; i++){
           karel.move();
       }
   }
    
    public static void recoger (Robot karel, int a){
        for (int i=1; i <= a; i++){
           karel.pickThing();
        }
    }      

    
    public static void main(String[] args)
   {  
    City prage = new City ();
            
   for (int i= 1; i<7;i++){
       for (int j=1; j<6; j++){
       Thing ball = new Thing(prage,i,j);
       }
   }
     
   Robot karel = new Robot(prage, 1, 0, Direction.EAST,30);
   
   
   movimiento (karel,5);
   girarDerecha (karel,3);
   movimiento (karel,5);
   girarDerecha (karel,3);
   movimiento (karel,4);
   girarDerecha (karel,3);
   movimiento (karel,4);
   girarDerecha (karel,3);
   movimiento (karel,3);
   girarDerecha (karel,3);
   movimiento (karel,3);
   girarDerecha (karel,3);
   movimiento (karel,2);
   girarDerecha (karel,3);
   movimiento (karel,2);
   girarDerecha (karel,3);
   movimiento (karel,1);
   girarDerecha (karel,3);
   movimiento (karel,1);
   
  
   
   
   }
}
