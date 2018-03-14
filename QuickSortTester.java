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
	int[] tenMil = QuickSort.buildArray(10000000, 10000000);
	int[] twentyFiveMil = QuickSort.buildArray(25000000, 25000000);
	int[] fortyMil = QuickSort.buildArray(40000000, 40000000);
	int[] fiftyMil = QuickSort.buildArray(50000000, 50000000);
	int[] seventyFiveMil = QuickSort.buildArray(75000000, 75000000);
	int[] hundredMil = QuickSort.buildArray(100000000, 100000000);




		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);

		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);

		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);

		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);

		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);

		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);

		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);

		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);

		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);

		time(tenMil);
		time(twentyFiveMil);
		time(fortyMil);
		time(fiftyMil);
		time(seventyFiveMil);
		time(hundredMil);

		


	
	
    } // end main method

} // end QuickSortTester class
