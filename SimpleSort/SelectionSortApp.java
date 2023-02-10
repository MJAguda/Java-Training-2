import java.util.Scanner;
class SelectionSortApp{
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter Size of Array : ");
        int maxSize = in.nextInt();
        
        ArraySel arr; // reference to array
        arr = new ArraySel(maxSize); // create the array
        
        System.out.print("Enter Elements of the Array with the size of " + maxSize + " :");
        for(int i = 0 ; i < maxSize ; i++){ //insert items
            int value = in.nextInt();
            arr.insert(value);
        }
        
        System.out.print("Unsorted Array : ");
        arr.display(); // display them again
        
        arr.selectionSort(); //sort array from least to greatest
        
        System.out.print("\nSorted Array : ");
        arr.display(); // display them again
    } // end main()
} // end class SelectionSortApp

