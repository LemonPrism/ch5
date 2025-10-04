import java.util.Scanner; 

public class Triangle
{
   public static void main (String []args){
       Scanner in = new Scanner ( System.in); 
       System.out.println("Enter a length for A"); 
       int A = in.nextInt(); 
       System.out.println("Enter a length for B"); 
       int B = in.nextInt(); 
       System.out.println("Enter a length for C"); 
       int C = in.nextInt(); 
       
       
       
       
       if ( A+B <= C || B >= A+C || B+C <= A||A<= 0 || B<= 0 || C <= 0  ){
            System.out.println("Cannot form a triangle"); 
           return; 
       }else {
          System.out.println("Can form a triangle"); 
       }
       
   }
}