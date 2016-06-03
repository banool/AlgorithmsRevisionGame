import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Brad on 31/05/2016.
 */
public class SelectionSort extends Algorithms {

    String name = "Selection Sort";
    String pseudo = "";
    String complexity = "";

    int finalCount;

    ArrayList<String> iterations = new ArrayList<String>();

    public void selectionSort (Integer[] array) {

        //Resets the iteration count from the Algorithms superclass.
        count = 1;

        //Add initial unsorted array into ArrayList.
        iterations.add(Arrays.toString(array));

        System.out.println("\n\n" + "Below are the iterations of " + name + ":");

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }

            //Swap i + j
            int smallerNumber = array[min];
            array[min] = array[i];
            array[i] = smallerNumber;

            //Add each iteration of Selection Sort to the Arraylist.
            iterations.add(Arrays.toString(array));
        }

        //Print collected contents of ArrayList.
        for (String s : iterations) {
            count++;
            System.out.println(count + ". " + s);
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
