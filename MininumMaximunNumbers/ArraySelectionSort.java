class ArraySelectionSort
{
    private double[] array; // ref to array a
    private int numElems; // number of data items
    
    //--------------------------------------------------------------
    
    public ArraySelectionSort(int max) // constructor
    {
        array = new double[max]; // create the array
        numElems = 0; // no items yet
    }
    //--------------------------------------------------------------
    
    public void insert(double value) // put element into array
    {
        array[numElems] = value; // insert it
        numElems++; // increment size
    }
    
    //--------------------------------------------------------------
    
    public void display() // displays array contents
    {
        for(int j=0; j<numElems; j++) // for each element,
            System.out.print(array[j] + " "); // display it
            System.out.println("");
    }
    
    public void displaymin(){
        System.out.println(array[0] + " ");
    }

    public void displaymax(){
        System.out.println(array[--numElems] + " ");
    }    
    //--------------------------------------------------------------
    public void search(double itemValue){
        int flag = 0;
        for(int i = 0 ; i < numElems ; i++){
            if (array[i] == itemValue){
                System.out.print("FOUND and is in index "+ i);
                flag = 1;
            }
        }
        
        if(flag==0){
            System.out.print("NOT FOUND");
        }
    }
    
    public void selectionSort()
    {
        int i, j, minElem;
        
        for(i=0; i<numElems-1; i++) // outer loop
        {
            minElem = i; // Store index of the minimum value among the elements
            
            for(j=i+1; j<numElems; j++)         // inner loop
                if(array[j] < array[minElem] )  // if min greater,
                    minElem = j;                // change index of the minimun value    
            
            swap(i, minElem); // swap them
        } // end for(outer)
    } // end selectionSort()
    
    //--------------------------------------------------------------
    
    private void swap(int x, int y)
    {
        double temp = array[x];
        array[x] = array[y];
        array[y] = temp;
    }

} // end class ArraySelection Sort
