/**
 * Created by Brad on 31/05/2016.
 */

import java.util.Scanner;
import java.util.Timer;


public class revision {
    Scanner scanner = new Scanner(System.in);
    Player p = new Player();
    String algorithm;

    public void run(){
        System.out.println("\n"+"Welcome to the Algorithms revision game." + "\n");
        System.out.println("First, please enter your name:");
        if (scanner.hasNextLine()) {
            p.setFirstName(scanner.nextLine());
        }
        System.out.println("\n" + "Hey, "+p.getFirstName()+"! Shall we get started? " +
                "The question is rhetorical -- of course we will!");
    }

    public void menu(){

        Algorithms a = new Algorithms();
        SelectionSort s = new SelectionSort();


        System.out.println("Which algorithm would you like to revise?");
        if(scanner.hasNextLine()){
            algorithm = scanner.nextLine();
        }

        switch(algorithm){
            case "selection sort":
                s.selectionSort();
        }

    }

    public static void main (String[] args) {

        revision game = new revision();

        //game.run();


        game.menu();

/*
        System.out.print("\n" + "Below is an unsorted array of integers:" + "\n");
        a.generateArray();
        a.shuffleArray();
        a.returnArray();



        System.out.println("\n" + "\n" + "This is the output of " + s.name + ":");
        s.selectionSort(a.array);*/
    }
}
