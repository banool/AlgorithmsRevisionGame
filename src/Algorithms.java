/**
 * Created by Brad on 31/05/2016.
 */

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;



public class Algorithms {

    List<Integer> list = new ArrayList<Integer>();
    List<Integer> list2 = new ArrayList<Integer>();
    Integer[] array;
    Integer[] array2;

    String name;
    String pseudo;
    String complexity;

    int count = 1;

    public void generateArray() {
        Random rand = new Random();
        int rval;
        for (int i = 0; i < 10; i++){
            rval = rand.nextInt(50) + 1;
            list.add(rval);
        }
    }

    public void shuffleArray(){
        Collections.shuffle(list);
        array = list.toArray(new Integer[list.size()]);
    }

    public void returnArray(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+", ");
        }
    }

    public void InitArray(){
        generateArray();
        shuffleArray();
        System.out.print("\n" + "Below is an unsorted array of integers:" + "\n");
        returnArray();
    }
}
