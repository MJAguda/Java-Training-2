/**
 * @(#)Temperature conversion.java
 *
 *
 * @author 
 * @version 1.00 2021/10/17
 */

import java.util.*;
public class Temperature_Conversion {

    public static void main(String[] args) {
    	//variable declaration
    	int choice;
    	float fahrenheit = 0;
    	float celsius = 0;
    	
    	System.out.println("Fahrenheit to Celsius - 1");
    	System.out.println("Celsius to Fahrenheit - 2");
    	System.out.println("-------------------------");
    	System.out.print("Enter Choice : ");
		
    	Scanner keyb = new Scanner(System.in);
    	choice = keyb.nextInt();
    	System.out.println("-------------------------");

    	if(choice == 1){
    			System.out.println("Fahrenheit to Celsius Conversion");
    			System.out.print("Enter Fahrenheit = ");
    			fahrenheit = keyb.nextFloat();
    			
    			celsius = ((fahrenheit - 32) * 5)/9;
    			
    			System.out.println("Celsius = (" + fahrenheit + "-32)*5/9");
    			System.out.println("Celsius = " +celsius);
    		}
    	else if(choice == 2){
    			System.out.println("Celsius to Fahrenheit Conversion");
    			System.out.print("Enter Celsius = ");
    			celsius = keyb.nextFloat();
    			
    			fahrenheit = ((celsius * 9)/5) + 32;
    			
    			System.out.println("Fahrenheit = (" + celsius + "*9/5)+32");
    			System.out.println("Fahrenheit = " +fahrenheit);
    		}
    	
    }
}