/**
 * Created by Brad on 31/05/2016.
 */

import java.util.LinkedHashSet;
import java.util.Arrays;

public class InsertionSort extends Algorithms {

    String name = "Insertion Sort";
    String pseudo = "";
    String complexity = "";

    /*LinkedHashSet houses each iteration of the Insertion Sort. LinkedHashSet is chosen because of its ability to
    preserve insertion order and uniqueness.*/
    LinkedHashSet<String> iterations = new LinkedHashSet<String>();

    int i;
    int j;
    int finalCount;

    public void insertionSort (Integer[] array) {

        //Resets the iteration count from the Algorithms superclass.
        count = 1;

        System.out.println("\n\n" + "Below are the iterations of " + name + ":");

        //Begin sort loop.
        for (i = 1; i < array.length; i++) {
            int key = array[i];

            for (j = i - 1; j >= 0 && key < array[j]; j--) {
                array[j + 1] = array[j];
            }
            array[j + 1] = key;

            //Output current instance of array to LinkedHashSet before For loop repeats.
            iterations.add(Arrays.toString(array));
        }

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
}
