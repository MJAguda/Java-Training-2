import java.util.Scanner;
class BubbleSortApp{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Size of Array : ");
        int maxSize = in.nextInt();
        
        ArrayBub arr; // reference to array
        arr = new ArrayBub(maxSize); // create the array
        
        System.out.print("Enter Elements of the Array with the size of " + maxSize + " :");
        for(int i = 0 ; i < maxSize ; i++){ //insert items
            int value = in.nextInt();
            arr.insert(value);
        }
        
        System.out.print("Unsorted Array : ");
        arr.display(); // display them again
        System.out.print("\nSorted Array : ");
        arr.bubbleSort(); //sort array from least to greatest
        arr.display(); // display them again
    } // end main()
} // end class BubbleSortApp
