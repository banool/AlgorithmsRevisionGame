/**
 * Created by Brad on 31/05/2016.
 */
public class SelectionSort extends Algorithms {

    String name = "Selection Sort";
    String pseudo = "";
    String complexity = "";


    public void selectionSort () {
        super.InitArray();
        System.out.println();
        System.out.println("\n" + "Below are the iterations of " + name + ":");
        for (int i = 0; i < super.array.length - 1; i++) {
            int min = i;

            for (int j = i + 1; j < super.array.length; j++) {
                if (super.array[j] < super.array[min]) {
                    min = j;
                }
            }

            //Swap i + j
            int smallerNumber = super.array[min];
            super.array[min] = super.array[i];
            super.array[i] = smallerNumber;

            //Prints each iteration of SelectionSort
            for (int y = 0; y < super.array.length; y++) {
                System.out.print(super.array[y]+", ");
                if (y == super.array.length - 1) {
                    System.out.println();
                }
            }
        }

        System.out.println("\n" + "This is the final sorted output of " + name + ":");

        for (int i = 0; i < super.array.length; i++) {
            System.out.print(super.array[i] + ", ");
        }
        System.out.println();
    }
}
