import java.util.*;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner keyb = new Scanner(System.in);
        
        int rep = 1, row, col;
        
        System.out.println("Multiplication Table");
        
        while(rep == 1){
            System.out.print("Enter Row :\t");
            row = keyb.nextInt();
            System.out.print("Enter Column :\t");
            col = keyb.nextInt();
        
            for(int i = 1 ; i <= row ; i++){
                for(int j = 1 ; j <= col; j++){
                    System.out.print("\t" + (i*j));
                }
                System.out.println();
            }
            System.out.print("Do you want to repeat? [Y/N]");
            char chc = keyb.next().charAt(0);
            
            if(chc == 'Y' || chc == 'y'){
                rep = 1;
            }
            else{
                rep = 0;
            }
        }
    }
}