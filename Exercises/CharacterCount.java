import java.util.Scanner;
import java.lang.Math;

class CharacterCount
{  
//user-defined static method that converts a number into words  
    static void count(char word[])  
    {  
        //determines the number of digits in the given number  
        int len = word.length;  
        int UpCount = 0;
        int LowCount = 0;
        int NumCharCount = 0;
        int SpecialCount = 0;
        int TotalCount = len;
        
        for (int i = 0 ; i < len ; i ++){
            int parseint;
            parseint = word[i];
            
            if(parseint >= 65 && parseint <= 90){//count uppercaseletter
                UpCount++;
            }
            else if(parseint >= 97 && parseint <= 122){//count lowercaseletter
                LowCount++;
            }
            else if(parseint >= 48 && parseint <= 57){//Numeric Characters
                NumCharCount++;
            }
            else if((parseint >= 32 && parseint <= 47) || (parseint >= 58 && parseint <= 64) || (parseint >= 91 && parseint <= 96) || (parseint >= 123 && parseint <= 126)){//Special Characters
                SpecialCount ++;
            }
            else{
                
            }
        } 
        
        System.out.println("Upper Case Letters          : " + UpCount);
        System.out.println("Lower Case Letters          : " + LowCount);
        System.out.println("Numeric Characters          : " + NumCharCount);
        System.out.println("Special Characters          : " + SpecialCount);
        System.out.println("Total Number of Characters  : " + TotalCount);
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
        System.out.print ("Enter any word : ");
        String str = keyb.nextLine();
        count(str.toCharArray());
    }
} 
 
