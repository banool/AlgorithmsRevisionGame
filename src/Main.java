/**
 * Created by Brad on 31/05/2016.
 */

import java.util.Scanner;

public class Main {

    Scanner scanner = new Scanner(System.in);
    PlayerManager pm = new PlayerManager();
    Player p = Player.INSTANCE;

    String algorithm;

    public static void main (String[] args) {
        Main game = new Main();
        game.run();
        while (true) {
            game.menu();
        }
    }

    public void run () {

        pm.inputPlayer();

        if (p.getFirstName() == null) {
            System.out.println("\n" + "Welcome to the Algorithms revision game." + "\n");
            System.out.println("First, please enter your name:");
            if (scanner.hasNextLine()) {
                p.setFirstName(scanner.nextLine());
            }
            System.out.println("\n" + "Hey, " + p.getFirstName() + "! Shall we get started? " +
                    "The question is rhetorical -- of course we will!" + "\n");
        } else if (p.getFirstName() != null) {
            System.out.println("\n" + "Welcome back, " + p.getFirstName() + ". Let's get started." + "\n\n");
        }
    }

    public void menu () {

        System.out.println("Which algorithm would you like to revise?");
        if (scanner.hasNextLine()) {
            algorithm = scanner.nextLine();
        }
        System.out.println();

        switch (algorithm.toLowerCase()) {

            case "selection sort":
                SelectionSort s = new SelectionSort();
                s.selectionSort();
                break;

            case "insertion sort":
                InsertionSort i = new InsertionSort();
                i.insertionSort();
                break;

            case "masters theorem":
                break;

            case "play game":
                /*Initiates quiz game that randomly retrieves algorithms/questions,
                and asks user for answers (i.e. "What is the final output of x Algorithm?")*/
                break;

            case "exit":
                pm.outputPlayer();
                System.exit(0);
                break;

            default:
                System.out.println("Oops, wrong command. Remember to use a single space between words " +
                        "(i.e. Selection Sort)" + "\n");
        }
    }
}
