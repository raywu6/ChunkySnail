// Team ChunkySnail (Jessica Wu, Raymond Wu, Alvin Ye)
// APCS2 pd8
// Lab01 -- What Does the Data Say?
// 2018-03-13
  
/*****************************************************
 * class QuickSort
 * Implements quicksort algo to sort an array of ints in place
 *
 * 1. Summary of QuickSort algorithm:
 * QSort(arr): 
 *   Choose a pivot point in the array to be sorted, optimally near the middle.
 *   Execute partition on pivot point, such that ints less than it are to the left, and
 *      ints greater than it are to the right.
 *   Recursively partition the left and right split halves of the array,
 *      such that the array is sorted.
 *
 * 2a. Worst pivot choice and associated runtime: 
 *   Generally, the position(s) that are furthest/require the maximum amount of
 *      comparisons and swaps: at the ends of the array
 *   By doing so, you are forced to go through the array linearly, and since 
 *      partition also runs in linear time, the total runtime is O(n*n).
 * 2b. Best pivot choice and associated runtime:
 *   Pivot point is on the middle index of the array.
 *      By dividing the array into approximately halves each time, we follow
 *      an algorithm that is similar to MergeSort. Runtime is O(n log n).
 * 3. Approach to handling duplicate values in array:
 *   If an int is equal to the value at the pivot point, it does not matter whether it goes
 *      to the left or right of the pivot point...
 *****************************************************/

public class QuickSort
{
    //--------------v  HELPER METHODS  v--------------
    //swap values at indices x, y in array o
    public static void swap( int x, int y, int[] o ) {
	int tmp = o[x];
	o[x] = o[y];
	o[y] = tmp;
    }

    //print input array 
    public static void printArr( int[] a ) {
	for ( int o : a )
	    System.out.print( o + " " );
	System.out.println();
    }

    //shuffle elements of input array
    public static void shuffle( int[] d ) {
	int tmp;
	int swapPos;
	for( int i = 0; i < d.length; i++ ) {
	    tmp = d[i];
	    swapPos = i + (int)( (d.length - i) * Math.random() );
	    swap( i, swapPos, d );
	}
    }

    //return int array of size s, with each element fr range [0,maxVal)
    public static int[] buildArray( int s, int maxVal ) {
	int[] retArr = new int[s];
	for( int i = 0; i < retArr.length; i++ )
	    retArr[i] = (int)( maxVal * Math.random() );
	return retArr;
    }


    public static int partition(int[] arr, int left, int right, int pvtPos)
    {
	int v = arr[pvtPos];
	swap( pvtPos, right, arr);
	int s = left;
	for (int i = left; i < right; i++)
	    {
		if (arr[i] < v)
		    {
			swap( s, i, arr);
			s++;
		    }
	    }
	
	swap( right, s, arr);
	return s;
	
    } // end partition method    
    
    //--------------^  HELPER METHODS  ^--------------



    /*****************************************************
     * void qsort(int[])
     * @param d -- array of ints to be sorted in place
     *****************************************************/
    public static void qsort( int[] d )
    { 
	// it makes sense to have SOLAMENTE UNO parameter ...
	// can feed thru to helper fxn with more parameters
	qsort( d, 0, d.length-1);
	
    } // end qsort( int[]) method


    
    //you may need a helper method...
    public static void qsort( int[] arr, int left, int right)
    {
	// from pseudocode from class ...
	
	if (left < right)
	    {
		// execute partition on the middle index ...
		int pvtPos = partition( arr, left, right, (left+right)/2);
		
		// then recursively for the split two halves
		qsort(arr, left, pvtPos-1);
		qsort(arr, pvtPos+1, right);
	    }
	
    } // end qSort(int[], int, int) method

}//end class QuickSort
