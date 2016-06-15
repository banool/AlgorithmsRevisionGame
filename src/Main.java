/**
 * Created by Brad on 31/05/2016.
 */

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
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
        Algorithms a = new Algorithms();

        switch (algorithm.toLowerCase()) {

            case "selection sort":
                SelectionSort s = new SelectionSort();
                a.initArray();
                s.selectionSort(a.array);
                break;

            case "insertion sort":
                InsertionSort i = new InsertionSort();
                a.initArray();
                i.insertionSort(a.array);
                break;

            case "quick sort":
            case "quicksort":
                QuickSort qs = new QuickSort();
                a.initArray();
                qs.quickSort(a.array);
                break;

            case "merge sort":
                MergeSort m = new MergeSort();

            case "master theorem":
                MasterTheorem mt = new MasterTheorem();
                mt.masterTheorem();
                break;

            case "play game":
                Quiz q = new Quiz();
                q.playQuiz(5);
                break;

            case "exit":
                pm.outputPlayer();
                System.exit(0);

            default:
                System.out.println("Oops, wrong command. Remember to use a single space between words " +
                        "(i.e. Selection Sort)." + "\n\n");
        }
    }
}
