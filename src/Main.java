/**
 * Created by Brad on 31/05/2016.
 */

import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    String algorithm;

    public void run(){
        Player p = new Player();
        System.out.println("\n"+"Welcome to the Algorithms revision game." + "\n");
        System.out.println("First, please enter your name:");
        if (scanner.hasNextLine()) {
            p.setFirstName(scanner.nextLine());
        }
        System.out.println("\n" + "Hey, "+p.getFirstName()+"! Shall we get started? " +
                "The question is rhetorical -- of course we will!");
    }

    public void menu(){

        SelectionSort s = new SelectionSort();

        System.out.println("Which algorithm would you like to revise?");
        if(scanner.hasNextLine()){
            algorithm = scanner.nextLine();
        }

        switch(algorithm.toLowerCase()){

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

            case "exit":
                System.exit(0);
        }
    }

    public static void main (String[] args) {

        Main game = new Main();
        //game.run();
        while(true){
            game.menu();
        }

    }
}
