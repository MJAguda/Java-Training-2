import java.util.Scanner;
class Exercise1{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter number of items : ");
        int maxSize = in.nextInt();
        
        ArraySelectionSort array; // reference to array
        array = new ArraySelectionSort(maxSize); // create the array
        
        for(int i = 1 ; i <= maxSize ; i++){ //insert items
            
            System.out.print("Enter " + i + " number : ");
            
            int value = in.nextInt();
            array.insert(value);
        }
        
        array.selectionSort(); //sort array from least to greatest
        
        System.out.print("\nMinimum Number is : ");
        array.displaymin();
        
        System.out.print("\nMaximum Number is : ");
        array.displaymax();
        
    } // end main()
} // end class Exercise1

