import java.util.*;
import java.lang.Math;

class BinaryToDecimal{
    public static void main(String args[])    {
        int decimal = 0;
        String str;
        int binaryequ [] = {1024,512,256,128,64,32,16,8,4,2,1};
        int len = binaryequ.length-1;
        
        Scanner keyb = new Scanner(System.in);   
        System.out.print ("Enter Binary Value : ");
        str = keyb.nextLine();
         
        for(int i = str.length() -1 ; i >= 0; i--){
            if(str.charAt(i) == '1'){
                decimal += (binaryequ[len]);
            }
            len--;
        }
        System.out.println("Decimal Value is : " + decimal);
        
    }
}
