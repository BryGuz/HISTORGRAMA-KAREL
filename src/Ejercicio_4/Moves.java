/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio_4;
import becker.robots.*;
import java.util.Scanner;
/**
 *
 * @author Bryan M
 */

    


public class Moves {
    
    
    private Robot rob;
    private City prague;
    private Thing bola;
    
    
    public void  Recorrido(){
        City prague = new City();
        Robot rob = new Robot(prague, 1, 0, Direction.SOUTH);
        Scanner lee= new Scanner(System.in);
        int n[]= new int [4];
        
        System.out.println("Escriba los numeros ");
        
        n[0] = lee.nextInt();
        n[1] = lee.nextInt();
        n[2] = lee.nextInt();
        n[3] = lee.nextInt();
         
      
      
        
         for(int i=0;i<n[0];i++){
           Thing bola= new Thing (prague, 2, 0);
       }
         for(int i=0;i<n[1];i++){
           Thing bola= new Thing (prague, 3, 0);
       }
         for(int i=0;i<n[2];i++){
           Thing bola= new Thing (prague, 4, 0);
       }
         for(int i=0;i<n[3];i++){
           Thing bola= new Thing (prague, 5, 0);
       }
      
        rob.move();
        
        for(int i=0;i<n[0]-1;i++){
        rob.pickThing();
        }
    
        rob.turnLeft();
       for(int i=0;i<n[0]-1;i++){
       rob.move();
       rob.putThing();
       }
 
      for(int i=0;i<3;i++)
       {
         rob.turnLeft();
       }
     
      rob.move();
       for(int i=0;i<3;i++)
       {
         rob.turnLeft();
       }
      for(int i=0;i<n[0]-1;i++){
      rob.move();
      }
      for(int i=0;i<2;i++){
          rob.turnLeft();
      }
      
      // N[1]
      
      for(int i=0;i<n[1]-1;i++){
          rob.pickThing();
        }
      for(int i=0;i<n[1]-1;i++){
            rob.move();
            rob.putThing();
       }
       for(int i=0;i<3;i++)
       {
         rob.turnLeft();
       }
      rob.move();
      for(int i=0;i<3;i++)
       {
         rob.turnLeft();
       }
      for(int i=0;i<n[1]-1;i++){
      rob.move();
      }
      for(int i=0;i<2;i++){
          rob.turnLeft();
      }
      // N[2]
       for(int i=0;i<n[2]-1;i++){
          rob.pickThing();
        }
      for(int i=0;i<n[2]-1;i++){
            rob.move();
            rob.putThing();
       }
       for(int i=0;i<3;i++)
       {
         rob.turnLeft();
       }
      rob.move();
      for(int i=0;i<3;i++)
       {
         rob.turnLeft();
       }
      for(int i=0;i<n[2]-1;i++){
      rob.move();
      }
      for(int i=0;i<2;i++){
          rob.turnLeft();
      }
      // N[3]
       for(int i=0;i<n[3]-1;i++){
          rob.pickThing();
        }
      for(int i=0;i<n[3]-1;i++){
            rob.move();
            rob.putThing();
       }
       for(int i=0;i<3;i++)
       {
         rob.turnLeft();
       }
      rob.move();
      for(int i=0;i<3;i++)
       {
         rob.turnLeft();
       }
      for(int i=0;i<n[3]-1;i++){
      rob.move();
      }
      for(int i=0;i<2;i++){
          rob.turnLeft();
      }
         System.out.println(rob.countThingsInBackpack());
    }
        
    }
    
       

