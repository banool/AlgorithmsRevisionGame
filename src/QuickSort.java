/**
 * Created by Brad on 31/05/2016.
 */

import java.util.LinkedHashSet;
import java.util.Arrays;

public class QuickSort extends Algorithms {

    String name = "Quick Sort";
    String pseudo = "";
    String complexity = "";

    /*LinkedHashSet houses each iteration of the Insertion Sort. LinkedHashSet is chosen because of its ability to
    preserve insertion order and uniqueness.*/
    LinkedHashSet<String> iterations = new LinkedHashSet<String>();

    int i;
    int j;
    int finalCount;

    public void quickSort(Integer[] array) {

        //Resets the iteration count from the Algorithms superclass.
        count = 1;

        System.out.println("\n\n" + "Below are the iterations of " + name + ":");

        //Start quicksorting.
        qsort(array, 0, array.length);

        //Print collected contents of LinkedHashSet.
        for (String s : iterations) {
            System.out.println(count++ + ". " + s);
        }

        //Print final sorted output
        finalCount = count - 1;
        System.out.println("\n" + "This is the final sorted output of " + name + ", after " + finalCount
                + " iterations:");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }

        System.out.println("\n" + "\n");
    }

    private void qsort(Integer[] array, int start, int end) {

        // Arrays of length 1 or 0 are obviously already sorted.
        if (end - start < 2) {
            return;
        }

        int pivotIndex = get_median_index(array, start, end);
        String pivotValue = Integer.toString(array[pivotIndex]); // Just for the printing part.

        PartitionBounds bounds = partition(array, start, end, pivotIndex);

        // No getters I know, sorry Java.
        int lt_upper = bounds.lt;
        int gt_lower = bounds.gt;

        // Not quite showing every single change, within the partition.
        // It does however show the array after each partition call,
        // which is the main step in a quicksort, with its pivot value and index.
        iterations.add(Arrays.toString(array) + " // Pivot was " + pivotValue + ", which was in index " + Integer.toString(pivotIndex));

        qsort(array, start, lt_upper);
        qsort(array, gt_lower, end);

    }

    private int get_median_index(Integer[] array, int start, int end) {

        // Purposely using integer division of course.
        int m = start + (end-start)/2;

        if (array[start] < array[m])
        {
            if (array[start] >= array[end-1])
                return 0;
            else if (array[m] < array[end-1])
                return m;
        }
        else
        {
            if (array[start] < array[end-1])
                return 0;
            else if (array[m] >= array[end-1])
                return m;
        }
        return end - 1;
    }

    private class PartitionBounds {         
        public final int lt;
        public final int gt;

        public PartitionBounds(int lt, int gt) {         
            this.lt = lt;
            this.gt = gt;
        }
    }

    // Uses the Dutch national flag method to avoid qsort worst case.
    // Returns the upper bound on the less-than section and the
    // lower bound on the greater-than section.
    private PartitionBounds partition(Integer[] array, int start, int end, int pivotIndex) {
        int lt = start; // Where to put next less-than number.
        int et = start; // Where to put next equal-to number.
        int gt = end - 2; // Where to put next greater-than number.

        // Just save the value of the pivot for easy referencing.
        int pivotValue = array[pivotIndex];

        // Swap pivot to the end of the array. We will swap it back once we're done.
        swap(array, pivotIndex, end - 1);

        for (int i = start; i < end - 1; i++) {
            if (array[i] < pivotValue) {
                // Don't hold i back here. We will have already checked the number
                // being swapped in because it is before i (in the less than section).
                swap(array, i, lt);
                lt++;
                et++;
            } else if (array[i] > pivotValue) {
                // Hold back i because we've pulled in a number from forward past i,
                // where we haven't checked yet.
                swap(array, i, gt);
                i--;
                gt--;
            } else {
                // Don't hold back because, even if we're moving the item forward past i,
                // we know what will happen since they're all equal in this section.
                swap(array, i, et);
                et++;
            }

            if (gt < et) {
                break;
            }
        }

        // Swap the pivot back into place (with the rest of the values equal to the pivot).
        swap(array, end - 1, et);

        // Return a Pair: Upper bound on less-than and the lower bound on greater-than.
        PartitionBounds bounds = new PartitionBounds(lt, gt+2);
        return bounds;

    }

    private void swap(Integer[] array, int index1, int index2) {

        if (index1 == index2) {
            return;
        }

        int tmp = array[index1];
        array[index1] = array[index2];
        array[index2] = tmp;
    }
}