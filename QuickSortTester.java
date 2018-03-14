// Team ChunkySnail (Jessica Wu, Raymond Wu, Alvin Ye)
// APCS2 pd8
// Lab01 -- What Does the Data Say?
// 2018-03-13

import java.lang.*;

public class QuickSortTester
{

    public static void time(int[] array)
    {
	long beforeTime = System.currentTimeMillis();
	QuickSort.qsort( array);
	long afterTime = System.currentTimeMillis();

	
	System.out.println(array.length + "," +  (afterTime - beforeTime));

	
    } // end time method
    
    public static void main(String[] args)
    {
	int[] tenK = QuickSort.buildArray(10000, 100000000);
	int[] fiftyK = QuickSort.buildArray(50000, 100000000);
	int[] hundredK = QuickSort.buildArray(100000, 100000000);
	int[] quarterMil = QuickSort.buildArray(250000, 100000000);
	int[] halfMil = QuickSort.buildArray(500000, 100000000);
	int[] tenMil = QuickSort.buildArray(10000000, 100000000);
	int[] twentyFiveMil = QuickSort.buildArray(25000000, 100000000);
	int[] fortyMil = QuickSort.buildArray(40000000, 100000000);
	int[] fiftyMil = QuickSort.buildArray(50000000, 100000000);
	int[] seventyFiveMil = QuickSort.buildArray(75000000, 100000000);
	int[] hundredMil = QuickSort.buildArray(100000000, 100000000);
	
	for (int i = 0; i < 11; i++)
	    {
		time(tenK);
		time(fiftyK);
		time(hundredK);
		time(quarterMil);
		time(halfMil);
		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);
	    }
	
    } // end main method

} // end QuickSortTester class
