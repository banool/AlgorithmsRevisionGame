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
    Random rand = new Random();

    Integer[] array;
    Integer[] array2;

    String name;
    String pseudo;
    String complexity;


    //Counts the iterations of a sort on an array.
    int count = 1;

    public static String superScript(String str) {
        str = str.replaceAll("0", "\u2070");
        str = str.replaceAll("1", "\u00B9");
        str = str.replaceAll("2", "\u00B2");
        str = str.replaceAll("3", "\u00B3");
        str = str.replaceAll("4", "\u2074");
        str = str.replaceAll("5", "\u2075");
        str = str.replaceAll("6", "\u2076");
        str = str.replaceAll("7", "\u2077");
        str = str.replaceAll("8", "\u2078");
        str = str.replaceAll("9", "\u2079");
        return str;
    }

    public static String subScript(String str) {
        str = str.replaceAll("0", "₀");
        str = str.replaceAll("1", "\u2081");
        str = str.replaceAll("2", "₂");
        str = str.replaceAll("3", "₃");
        str = str.replaceAll("4", "₄");
        str = str.replaceAll("5", "₅");
        str = str.replaceAll("6", "₆");
        str = str.replaceAll("7", "₇");
        str = str.replaceAll("8", "₈");
        str = str.replaceAll("9", "₉");
        return str;
    }

    public int returnRandom(){
        int rval = rand.nextInt(9);
        return rval;
    }

    //Generates 10 random integers between 1 and 50, and stores them into the ArrayList.
    public void generateArray() {

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
