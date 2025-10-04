    import java.util.Scanner; 
    
    public class Quadratic
    {
        public static void main ( String []args){
            Scanner in = new Scanner ( System.in); 
            System.out.println("Enter value of a for the quadratic"); 
            int a = in.nextInt(); 
            System.out.println("Enter value of b for the quadratic");
            int b = in.nextInt(); 
            System.out.println("Enter value of c for the quadratic");
            int c = in.nextInt();
            
            double dis = (double) b*b -  4.0*a*c;
            
            double eq1 = (    (( -b + Math.sqrt(dis)) / (2.0*a) ) );        
            double eq2 = (    ( (-b - Math.sqrt(dis)) / (2.0*a) ) ); 
            
            
            
            
            if ( a==0){
                System.out.println("Error: a cannot be 0"); 
                return; 
            }
             
            
            if ( dis == 0 ) { 
                System.out.println (eq1); 
            } 
            if ( dis >0){
                System.out.println( "Solution 1 " + eq1 + " Solution 2 " + eq2); 
            }
            if ( dis <0){
                 System.out.println("No solutions"); 
            }
            
            
            }
            
            
            
        }
