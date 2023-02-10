import java.util.Scanner;
class Exercise2{
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

        System.out.print("Enter item to search : ");
        int itemVal = in.nextInt();
    
        System.out.print("Item " +itemVal+ " is ");
        array.search(itemVal); //Search each index for the existence of itemSearch
        System.out.println();
    } // end main()
} // end class Exercise2

