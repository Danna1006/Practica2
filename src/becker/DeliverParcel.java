package becker;

import becker.robots.*;

public class DeliverParcel
{
   public static void girarDerecha (Robot karel, int a){
       for (int i = 1; i <= a; i++){
           karel.turnLeft();
       }
   }
   
   public static void main(String[] args)
   {  
     // Set up the initial situation
      City prage = new City();
    
      for (int i= 1; i<3;i++){
      Wall p1 = new Wall (prage, 1, i, Direction.NORTH);
      };
      for (int i= 1; i<3;i++){
      Wall p2 = new Wall (prage, i, 0, Direction.EAST);
      };
      for (int i= 1; i<3;i++){
      Wall p3 = new Wall (prage, 2, i, Direction.SOUTH);
      };
      for (int i= 1; i<3;i++){
      Wall p4 = new Wall (prage, i, 3, Direction.WEST);
      };
      Robot karel = new Robot(prage, 0, 2, Direction.WEST,0);
    
      // Direct the robot to the final situation
      girarDerecha(karel,2);
      karel.move();
      girarDerecha(karel,3);
      karel.move();
      karel.move();
      karel.move();
      girarDerecha(karel,3);
      karel.move();
      karel.move();
      karel.move();
      girarDerecha (karel,3);
      karel.move();
      karel.move();
      karel.move();
      girarDerecha (karel,3);
      karel.move();
      karel.move();
      girarDerecha (karel,2);
      
      //karel.turnLeft();
      
  
      System.out.println(karel.countThingsInBackpack());
   }
}
