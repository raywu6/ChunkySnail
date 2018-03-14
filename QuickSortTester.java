// Team ChunkySnail (Jessica Wu, Raymond Wu, Alvin Ye)
// APCS2 pd8
// Lab01 -- What Does the Data Say?
// 2018-03-13


/**
   Our QuickSortTester.java has two methods: a time(int[]) method, and a main method.

   In our main method, we have a for loop which runs 11 iterations, and in each iteration we create 11 arrays ranging from sizes 10 thousand to 100 million using the buildArray function in QuickSort.java. We kept the maximum number in each array the same in order to ensure that the only independent variable would be the size of the array. We then call the time(int[]) method on each of the arrays to test QuickSort with eleven trials of eleven arrays each.

   In our time(int[]) method, a long variable named beforeTime holds the value of the current time in milliseconds since epoch. Then, the array is sorted using QuickSort, before a long variable named afterTime is bound to the value of the current time in milliseconds since epoch. Finally, the function prints in the csv format the array length, followed by the delta of the two long variables.
*/


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
	for (int i = 0; i < 11; i++)
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
