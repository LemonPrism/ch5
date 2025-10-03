import java.util.Scanner; 

public class Fermat
{
    public static void main ( String []args){
        Scanner in =  new Scanner ( System.in); 
        System.out.println(" Please enter four integers inputs to check if Fermat's Theorem holds"); 
        System.out.println( "Enter a"); 
        int a = in.nextInt(); 
        System.out.println( "Enter b");
        int b = in.nextInt(); 
        System.out.println( "Enter c");
        int c = in.nextInt();
        System.out.println( "Enter n");
        int n = in.nextInt();
        
        double ferTheorem = (Math.pow(a, n ) +  Math.pow( b , n)) ; 
        
        if ( n > 2 && ferTheorem == Math.pow( c,n) ){
            
            System.out.println("Holy smokes, Fermat was wrong!" );
            
        }else {
             System.out.println("No, that doesn't work" );
        }
        
        
        
        
        
    }
    
}