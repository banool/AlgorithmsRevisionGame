/**
 * Created by Brad on 31/05/2016.
 */

import java.util.Scanner;

public class Main {
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
                break;

            case "insertion sort":
                break;

            case "masters theorem":
                break;

            case "play game":
                /*Initiates quiz game that randomly retrieves algorithms/questions,
                and asks user for answers (i.e. "What is the final output of x Algorithm?")*/
                break;
        }
    }

    public static void main (String[] args) {

        Main game = new Main();
        //game.run();
        game.menu();
    }
}
