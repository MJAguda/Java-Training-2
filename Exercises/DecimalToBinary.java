import java.util.*;

public class DecimalToBinary {
    public static void main(String[] args){
            Scanner keyb = new Scanner(System.in);
            
            int decimal, binary = 0, remainder = 0, unitplace = 1;
             
            System.out.print("Enter Decimal Value : "); 
            decimal = keyb.nextInt();
            
            System.out.print("Binary Equivalent of " + decimal + " is : ");
            
            while(decimal > 0){
                remainder = decimal % 2;
                decimal = decimal / 2;
                binary = binary + (remainder * unitplace);
                unitplace = unitplace * 10;
                }
            System.out.println(binary);
    }
}