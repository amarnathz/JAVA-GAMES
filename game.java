/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.util.Scanner;

/**
 *
 * @author amarnathm
 */
public class game {
     public static void main(String [] args){
     int num=(int )(Math.random()*10)+1;
         System.out.println("Guess Number :");
     Scanner s=new Scanner(System.in);
     int a;
     for(int i=0;i<10;i++){
         a=s.nextInt();
     System.out.println("you have remaining quess life:"+(10-i));
     
     if(a<num){
     System.out.println("bigger than :"+a);
     
     }
     else if(a>num){
     System.out.println("smaller than :"+a);
     }
     else{
      System.out.println(" you Win :-----crt-------");
      break; 
     }
     
     }
     
     }
}
