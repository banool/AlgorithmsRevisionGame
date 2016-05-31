/**
 * Created by Brad on 31/05/2016.
 */
public class SelectionSort extends Algorithms {

    String name = "Selection Sort";
    String pseudo = "";
    String complexity = "";

    public void selectionSort (Integer[] array) {
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

            //Prints each iteration of SelectionSort
            for (int y = 0; y < array.length; y++) {
                System.out.print(array[y]+", ");
                if (y == array.length - 1) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n" + "This is the final sorted output of " + name + ":");

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
    }
}
