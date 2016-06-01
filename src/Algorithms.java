/**
 * Created by Brad on 31/05/2016.
 */

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class Algorithms {

    List<Integer> list = new ArrayList<Integer>(10);
    List<Integer> list2 = new ArrayList<Integer>();
    Integer[] array;
    Integer[] array2;

    String name;
    String pseudo;
    String complexity;

    int count = 1;

    //Generates 10 random integers between 1 and 50, and stores them into the ArrayList.
    public void generateArray() {
        Random rand = new Random();
        int rval;
        for (int i = 0; i < 10; i++){
            rval = rand.nextInt(50) + 1;
            list.add(rval);
        }
    }
    //Shuffles the list, and then copies its contents into an Integer array.
    public void shuffleArray(){
        Collections.shuffle(list);
        array = list.toArray(new Integer[list.size()]);
    }

    public void returnArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
    }

    //Runs the above methods.
    public void initArray(){
        generateArray();
        shuffleArray();
        System.out.print("\n" + "Below is an unsorted array of integers:" + "\n");
        returnArray();
    }
}
