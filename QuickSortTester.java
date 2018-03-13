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

	
	System.out.println(array.length + "," +  (afterTime - beforeTime));

	
    } // end time method
    
    public static void main(String[] args)
    {
	int[] oneK   = QuickSort.buildArray(1000  , 1000);
	int[] tenK   = QuickSort.buildArray(10000 , 10000);
	int[] twentyK = QuickSort.buildArray(20000, 20000);
	int[] thirtyK = QuickSort.buildArray(30000, 30000);
	int[] fortyK = QuickSort.buildArray(40000, 40000);	
	int[] fiftyK = QuickSort.buildArray(50000 , 50000 );
	int[] sixtyK = QuickSort.buildArray(60000, 60000);
	int[] hundredK = QuickSort.buildArray(100000, 100000);
	int[] oneMil = QuickSort.buildArray(1000000, 1000000);
	int[] fiveMil =QuickSort.buildArray(5000000, 5000000);
	int[] tenMil = QuickSort.buildArray(10000000, 10000000);


	for(int i = 0; i < 10; i++){
		time(oneK);
    	time(tenK);
		time(twentyK);
		time(thirtyK);
		time(fortyK);
		time(fiftyK);
		time(sixtyK);
		time(hundredK);
		time(oneMil);
		time(fiveMil);
		time(tenMil);
	}
	
	
    } // end main method

} // end QuickSortTester class
