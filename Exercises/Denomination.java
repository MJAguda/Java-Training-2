/**
 * @(#)Denomination.java
 *
 *
 * @Mark Jayson M. Aguda 
 * @version 1.00 2021/10/17
 */

import java.util.*;

public class Denomination {
    public static void main(String[] args) {
    	int money = 0, N1k, N500, N200, N100, N50, N20, N10, N5; //declaration of variables
		Scanner keyb = new Scanner(System.in); //copying class Scanner to keyb
		System.out.print("Enter amount of Money : "); 
		money = keyb.nextInt(); //Store input from user
		
		N1k = money / 1000; //process
		money %= 1000;
		N500 = money / 500;
		money %= 500;
		N200 = money / 200;
		money %= 200;
		N100 = money / 100;
		money %= 100;
		N50 = money / 50;
		money %= 50;
		N20 = money / 20;
		money %= 20;
		N10 = money / 10;
		money %= 10;
		N5 = money / 5;
		money %= 5;
		
		System.out.println("1000\t:\t" + N1k); //output
		System.out.println(" 500\t:\t" + N500);
		System.out.println(" 200\t:\t" + N200);
		System.out.println(" 100\t:\t" + N100);
		System.out.println("  50\t:\t" + N50);
		System.out.println("  20\t:\t" + N20);
		System.out.println("  10\t:\t" + N10);
		System.out.println("   5\t:\t" + N5);
		System.out.println("   1\t:\t" + money);
    }
}