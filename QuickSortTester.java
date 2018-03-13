// Team ChunkySnail (Jessica Wu, Raymond Wu, Alvin Ye)
// APCS2 pd8
// Lab01 -- What Does the Data Say?
// 2018-03-13

import java.lang.*;

public class QuickSortTester
{

    public static void time(int[] array)
    {
	long beforeTime = System.nanoTime();
	QuickSort.qsort( array);
	long afterTime = System.nanoTime();

	System.out.println(afterTime - beforeTime);
	
    } // end time method
    
    public static void main(String[] args)
    {
	int[] oneK   = QuickSort.buildArray(1000  , 1000);
	int[] tenK   = QuickSort.buildArray(10000 , 1000);
	int[] fiftyK = QuickSort.buildArray(50000 , 1000);

	time(oneK);
        time(tenK);
	time(fiftyK);
	
    } // end main method

} // end QuickSortTester class
