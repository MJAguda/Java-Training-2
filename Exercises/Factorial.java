import java.util.*;

public class Factorial{
    public static void main(String[] args){
            Scanner keyb = new Scanner(System.in);
            
            int x;
             
            System.out.print("Enter X : "); 
            x = keyb.nextInt();
            int factorial = 1;
            
            for(int i = 1 ; i <= x ; i++){
                
                factorial = factorial * i;                    
            }
            System.out.println("Factorial of " + x + " : " + factorial);                
    }
}