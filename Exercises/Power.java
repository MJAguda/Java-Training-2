import java.util.*;

public class Power{
    public static void main(String[] args){
            Scanner keyb = new Scanner(System.in);
            
            int x;
            int power = 1;
             
            System.out.print("Enter X : "); 
            x = keyb.nextInt();
            
            for(int i=1 ; i <= x ; i++){
                power = power * 2;
                System.out.println("2 raised to " + i + " : " + power);                    
            }                
    }
}