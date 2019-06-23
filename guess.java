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
class game1{

  void started(String movie,int n){
 int wc=0;
 
 String notice="you have guessed ("+wc+") wrong Letter:";
 movie=movie.replaceAll("\\s", "");
 String d=movie.replaceAll("["+movie+"]", "-");
 System.out.print("you are Guessing :"+d+" "+"Length :"+movie.length());
 Scanner sc=new Scanner(System.in);
 String ch="";
 while(d!=movie){
     
 System.out.print("\n"+notice+"\nGuess a letter[press $ to Hint]:");
 
 char letter = sc. next(). charAt(0);
 if(letter=='$')
 { System.out.println("Hint:"+movie.substring(0,3)+"****"+"\n"+"Guess a letter :"); 
 letter = sc. next(). charAt(0); 
 }
 int ind=movie.indexOf(letter);
 if( ind!=-1) 
 { 
 while(ind!=-1)
 {
   d=d.substring(0,ind)+letter+d.substring(ind+1);
   ind=movie.indexOf(letter,ind+1);
  
 }
 }
 else 
 {
   
   if(ch.indexOf(letter)==-1)
   {ch=ch+" "+letter;
   wc+=1;
   }
   notice="you have guessed ("+wc+") wrong Letter:"+" "+ch;
 }
 
 System.out.print(d);
 if(d.equals(movie)){
     System.out.println("You With :\n you have guessed "+movie+" correctly.");
     break;
     
 }
}
 
  }

}
public class guess {
    public static void main(String[] args)
    {
    game1 g=new game1();
    
    int rnum=(int )(Math.random()*25)+1;
    while(rnum>25){
      rnum=(int )(Math.random()*25)+1;
    }
    String movie[]={"the shawshank redemption","the godfather","the dark knight",
"schindler list",
"pulp fiction",
"the lord of the rings",
"the good the bad and the ugly",
"fight club",
"the lord of the rings",
"forrest gump",
"star wars",
"inception",
"the lord of the rings",
"the matrix",
"samurai",
"star wars",
"city of god",
"the silence of the lambs",
"batman begins",
"die hard",
"chinatown",
"room",
"dunkirk",
"fargo",
"no country for old men"};
    g.started(movie[rnum],movie[rnum].length());
    
    }
}
