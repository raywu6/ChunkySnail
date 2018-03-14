ChunkySnail (Jessica Wu, Raymond Wu, Alvin Ye) <br>
APCS2 pd8 <br>
Lab01 -- What Does the Data Say? <br>
2018-03-13 <br>

## Hypothesis
* We believe that the best runtime of QuickSort is O(nlogn) because of the splitting-in-half nature that is similar to MergeSort <br>
* We believe that the average runtime of QuickSort is O(nlogn) because even if the pivot point is not exactly the middle index, the array will be able to split itself into two separate arrays, continuing, the recursive nature of the algorithm. This can be also seen in MergeSort when there is no middle index because the length of the array is even, and Java chooses the element to the left of the "middle." <br>
* We believe that if the data is arranged so that the pivot point is at either ends of the array, the runtime will be O(n*n) because it would take O(n) time to traverse the entire array, and partition takes O(n) time.  <br>

## Background
Our ``QuickSortTester.java`` has two methods: a ``time(int[])`` method, and a ``main`` method. <br>

In our main method, we have a for loop which runs 11 iterations, and in each iteration we create 11 arrays ranging from sizes 10 thousand to 100 million using the ``buildArray`` function in ``QuickSort.java``. We kept the maximum number in each array the same in order to ensure that the only independent variable would be the size of the array. We then call the ``time(int[])`` method on each of the arrays to test QuickSort with eleven trials of eleven arrays each.

In our ``time(int[])`` method, a ``long`` variable named ``beforeTime`` holds the value of the current time in milliseconds since epoch. Then, the array is sorted using QuickSort, before a ``long`` variable named ``afterTime`` is bound to the value of the current time in milliseconds since epoch. Finally, the function prints in the csv format the array length, followed by the delta of the two long variables.

## Methology:
1. We used ``System.currentTimeMillis()`` in order to measure the time it took for each run of QuickSort.
2. We tested QuickSort with arrays from size 10 thousand to 100 million.
3. We SOP'ed the content into a csv file, formatted with a comma to separate array size and time.
4. We used Google Sheets to graph the csv file information.

## Results
![ChunkySnail_Scatterplot](https://i.imgur.com/G9nJRRw.png).

## Conclusions
It appears that our QuickSort is O(n), or linear time. It appears that our QuickSort is O(n), or linear time. The graph shows that our initial hypothesis was wrong. Based on our review of the code, we could not find why the algorithm appears to run in linear time, and our general consensus is that the algorithm could be running slower due to other computer processes running in the background.