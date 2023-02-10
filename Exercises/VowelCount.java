import java.util.*;
import java.lang.Math;

class VowelCount{
    public static void main(String args[])    {
        
        int vowels[] = {0,0,0,0,0};
        
        Scanner keyb = new Scanner(System.in);   
        System.out.print ("Enter String : ");
        String str = keyb.nextLine();
        
        for(int j = 0 ; j < str.length(); j++){
            System.out.print(str.charAt(j));
            switch(str.charAt(j)){
                case 'a':
                    vowels[0]++;
                    break;
                case 'e':
                    vowels[1]++;
                    break;
                case 'i':
                    vowels[2]++;
                    break;
                case 'o':
                    vowels[3]++;
                    break;
                case 'u':
                    vowels[4]++;
                    break;
                default:
                    break;
            }    
        }
        
        System.out.println("\na : " + vowels[0]);
        System.out.println("e : " + vowels[1]);
        System.out.println("i : " + vowels[2]);
        System.out.println("o : " + vowels[3]);
        System.out.println("u : " + vowels[4]);
    }
}
