import java.util.*;

public class Fibonacci {
    public static void main(String[] args){
            Scanner keyb = new Scanner(System.in);
            
            int x, firstTerm = 1, secondTerm = 1;
             
            System.out.print("\nEnter X : "); 
            x = keyb.nextInt();
            
            System.out.println("Fibonacci Series until " + x + "th term:");

            for (int i = 1; i <= x; ++i) {
                  System.out.print(firstTerm + " ");

                  int nextTerm = firstTerm + secondTerm; //computer nextTerm
                  firstTerm = secondTerm;
                  secondTerm = nextTerm;
            }                        
    }
}