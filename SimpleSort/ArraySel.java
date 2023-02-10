// selectSort.java
// demonstrates selection sort
//--------------------------------------------------------------
class ArraySel
{
    private double[] a; // ref to array a
    private int nElems; // number of data items
    
    //--------------------------------------------------------------
    
    public ArraySel(int max) // constructor
    {
        a = new double[max]; // create the array
        nElems = 0; // no items yet
    }
    //--------------------------------------------------------------
    
    public void insert(double value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }
    
    //--------------------------------------------------------------
    
    public void display() // displays array contents
    {
        for(int j=0; j<nElems; j++) // for each element,
        	System.out.print(a[j] + " "); // display it
        	System.out.println("");
    }
    
    //--------------------------------------------------------------
    
    public void selectionSort()
    {
        int i, j, min;
        
        for(i=0; i<nElems-1; i++) // outer loop
        {
            min = i; // minimum
            
            for(j=i+1; j<nElems; j++) // inner loop
            	if(a[j] < a[min] ) // if min greater,
            		min = j; // we have a new min	
            
            swap(i, min); // swap them
        } // end for(outer)
    } // end selectionSort()
    
    //--------------------------------------------------------------
    
    private void swap(int one, int two)
    {
        double temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

} // end class ArraySel
