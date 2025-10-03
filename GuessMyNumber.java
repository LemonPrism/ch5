import java.util.Scanner; 
import java.util.Random; 


public class GuessMyNumber
{
   public static void main ( String []args){
       Scanner in = new Scanner( System.in);
       Random random = new Random(); 
       int number = random.nextInt(100)+1; 
      
       
       System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?"); 
       System.out.println("Type a number"); 
       int g= in.nextInt(); 

     if( g> number){
           System.out.println ("You were too high"); 
       } else if(g== number){
           System.out.println("You are CORRECT, the number I was thinking of is:" + number);
           return; 

         } else {
           System.out.println( "You were too low");
        }
    
       
         System.out.println("Try again"); 
       System.out.println("Type a number"); 
        int l = in.nextInt(); 

       if( l > number){
           System.out.println ("You were too high"); 
       } else if(l == number){
           System.out.println("You are CORRECT, the number I was thinking of is:" + number); 
            return; 
         } else {
           System.out.println( "You were too low");
       }
    
    
      
       System.out.println("Last try"); 
       System.out.println("Type a number"); 
        int  s = in.nextInt(); 

       if( s> number){
           System.out.println ("You were too high"); 
       } else if(s== number){
           System.out.println("You are CORRECT, the number I was thinking of is:" + number); 
            return; 
         } else {
           System.out.println( "You were too low");
       }
       
    
       
    System.out.println("The number I was thinking of is:"+ number);
       
       
   }
}