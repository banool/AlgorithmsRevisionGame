/**
 * Created by Brad on 1/06/2016.
 */

import java.util.Random;

public class Quiz {

    private static final int NULL = 0;

    Random rand = new Random();
    Player p = Player.INSTANCE;

    String[] algs = new String[]{"Insertion Sort", "Selection Sort"};

    int rval;
    int qCount;
    String randAlg;
    String answer;

    //Selects a random value stored within the algs array, and stores this value into the randAlg variable.
    public void randomAlgorithm () {
        rval = rand.nextInt(algs.length);
        randAlg = algs[rval];
    }

    public void iterationQuestion () {
        System.out.println("\n\n" + "How many iterations would it take to sort the unsorted array above using "
                + randAlg.toUpperCase() + "?");
        if (Main.scanner.hasNextLine()) {
            answer = Main.scanner.nextLine();
        }
    }

    /*public void checkAnswer () {
        if (answer.equals(a.count)) {
            int i = p.getCorrectAnswers();
            p.setCorrectAnswers(i++);
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :(");
        }
    }*/

    public void playQuiz (int maxQuestions) {

        while (qCount < maxQuestions) {

            Algorithms a = new Algorithms();
            InsertionSort i = new InsertionSort();
            SelectionSort s = new SelectionSort();

            a.initArray();
            randomAlgorithm();

            switch (randAlg) {

                case "Insertion Sort":
                    iterationQuestion();
                    i.insertionSort(a.array);
                    //checkAnswer();
                    qCount++;
                    break;

                case "Selection Sort":
                    iterationQuestion();
                    s.selectionSort(a.array);
                    //checkAnswer();
                    qCount++;
                    break;
            }
        }
    }
}
