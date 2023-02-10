import java.util.*;

class DecimalToHexadecimal{
    public static void main(String args[])    {
    	char ch[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
	int rem, decimal;
	String hexadecimal=""; 
	
        Scanner keyb = new Scanner(System.in);   
        System.out.println("Enter a Decimal number: ");
        decimal=keyb.nextInt();
        
        System.out.println("Hexadecimal number is : ");
        
        while(decimal != 0)
        {
        	rem = decimal%16;
                hexadecimal = ch[rem] + hexadecimal;
                decimal = decimal/16;
        }   
       
        System.out.println(hexadecimal + "\n");   
    }
}