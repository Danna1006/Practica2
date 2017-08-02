/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package becker;

import becker.robots.*;
/**
 *
 * @author ESTUDIANTE
 */
public class Ejercicio {
    
    public static void girarDerecha (Robot karel, int a){
       for (int i = 1; i <= a; i++){
           karel.turnLeft();
       }
   }
    
    public static void main(String[] args)
   {  
    City prage = new City ();
    Thing ball = new Thing(prage, 2,2);
            
   for (int i= 1; i<3;i++){
      Wall p1 = new Wall (prage, 1, i, Direction.NORTH);
      };
   for (int i= 1; i<3;i++){
      Wall p2 = new Wall (prage, i, 1, Direction.WEST);
      };
   Wall p3 = new Wall (prage,1,2, Direction.EAST);
   Wall p4 = new Wall (prage,1,2, Direction.SOUTH);
   Wall p5 = new Wall (prage,2,1, Direction.SOUTH);
   Robot karel = new Robot(prage, 1, 2, Direction.SOUTH,1);
   
   girarDerecha(karel,3);
   karel.move();
   karel.turnLeft();
   karel.move();
   karel.turnLeft();
   karel.move();
   karel.pickThing();
   girarDerecha(karel,3);
   karel.move();
   girarDerecha(karel,2);
   karel.move();
   girarDerecha(karel,3);
   karel.move();
   girarDerecha(karel,3);
      
}
}
