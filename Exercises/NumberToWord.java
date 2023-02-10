import java.util.Scanner;
import java.lang.Math;

class NumberToWord
{  
//user-defined static method that converts a number into words  
    static void numberToWords(char num[])  
    {  
        //determines the number of digits in the given number  
        int len = num.length;  
        String word = "";
        int commacount = 0;
        int pointerOnce = 0, pointerTens = 0, pointerHundreds = 0;
        
        //counts number of commas
        for(int i = 0 ; i < len-1 ; i++){
            if(num[i] == ','){
                ++commacount;
            }
        }
        
        //check if string has value
        if (len == 0)   
        {  
            System.out.println("The Value is empty.");  
            return;  
        }  
        
        else if(len >= (Math.pow(10, 101))){
            System.out.println("The Value is exceeds Googolplex.");  
            return; 
        }
        
        String[] oncedigits = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};  
        String[] tensdigits = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};  
        String[] hundreddigits = new String[] {"",  "One Hundred", "Two Hundred", "Three Hundred", "Four Hundred", "Five Hundred", 
            "Six Hundred", "Seven Hundred", "Eight Hundred", "Nine Hundred"};  
        String[] powerdigits = new String[] {"", "Thousand", "Million", "Billion", "Trillion", "Quadrillion", "Quintillion", "Hexillion", 
            "Septillion", "Octillion", "Nonillion", "Decillion", "Undecillion", "Duodecillion", "Tredecillion", "Quattuordecillion", 
            "Quindecillion", "Hexdecillion", "Septendecillion", "Octodecillion", "Novemdecillion", "Vigintillion", "Unvigintillion", 
            "Duovigintillion", "Trevigintillion", "Quattourvigintillion", "Quinvigintillion", "Hexvigintillion", "Septenvigintillion", 
            "Octovigintillion", "Novemvigintillion", "Trigintillion", "Untrigintillion", "Duotrigintillion", "Googol", "Googolplex"};  
      
        int i;
        for(i = 1 ; i <= commacount ; i++){
            pointerOnce = num[len-1] - '0';
            pointerTens = num[len-2] - '0';
            pointerHundreds = num[len-3] - '0';
            word = hundreddigits[pointerHundreds] + " " + tensdigits[pointerTens] + " " + oncedigits[pointerOnce] + " " + word;
             
            if((num[len-1-4] - '0') == 0 && (num[len-2-4] - '0') == 0 && (num[len-3-4] - '0') == 0){
                //word = powerdigits[i]+ " " + word;
            }
            else{
                word = powerdigits[i]+ " " + word;
            }
            len-=4;
        }
       
        int count = 1;
        for(i = len-1 ; i >= 0 ; i--){
                pointerOnce = num[i] - '0';
            switch(count){
                case 1:
                    word = oncedigits[pointerOnce] + " " + word;
                    break;
                case 2:
                    word = tensdigits[pointerOnce] + " " + word;
                    break;
                case 3:
                    word = hundreddigits[pointerOnce] + " " + word;
                    break;
                default:
                    break;
            }
            count++;
        }
        
        System.out.print("In words : ");
        System.out.println(word);
    }  
//main() method  
    public static void main(String args[])  
    {  
        /*numberToWords("7,654,321".toCharArray());          
        numberToWords("87,654,321".toCharArray()); 
        numberToWords("987,654,321".toCharArray()); 
        numberToWords("10,987,654,321".toCharArray()); 
        numberToWords("110,987,654,321".toCharArray()); */
        Scanner keyb = new Scanner(System.in);   
        System.out.print ("Enter Value with comma : ");
        String str = keyb.nextLine();
        numberToWords(str.toCharArray());
    }
} 
 
