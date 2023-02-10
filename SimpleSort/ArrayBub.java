// bubbleSort.java
// demonstrates bubble sort
    
import java.io.*;     // for I/O

class ArrayBub
{
    private double[] a; // ref to array a
    
    private int nElems; // number of data items
    
    //-------------------------------------------------------------
    
    public ArrayBub(int max) // constructor
    {
        a = new double[max]; // create the array
        nElems = 0; // no items yet
    }
    
    //-------------------------------------------------------------
    
    public void insert(double value) // put element into array
    {
        a[nElems] = value; // insert it
        nElems++; // increment size
    }
    
    //-------------------------------------------------------------
    
    public void display() // displays array contents
    {
        for(int j=0; j<nElems; j++) // for each element,
        System.out.print(a[j] + " "); // display it
        System.out.println("");
    }
    
    //-------------------------------------------------------------
    
    public void bubbleSort()
    {
        for(int i=nElems-1 ; i > 0 ; i--) // outer loop (backward)
            for(int j=0; j<i; j++) // inner loop (forward)
                if( a[j] > a[j+1] ) // out of order?
                    swap(j, j+1); // swap them
    } // end bubbleSort()
    
    //-------------------------------------------------------------
    
    private void swap(int one, int two)
    {
        double temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
    
    //-------------------------------------------------------------
    
    } // end class ArrayBub
   