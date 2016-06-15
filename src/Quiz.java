/**
 * Created by Brad on 1/06/2016.
 */

import java.util.Random;

public class Quiz extends Algorithms {

    private static final int NULL = 0;

    Player p = Player.INSTANCE;

    String[] algs = new String[]{"Insertion Sort", "Selection Sort", "Quick Sort"};

    int rval;
    int qCount;
    int maxQ;

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

    public void checkAnswer (int count) {
        if (answer.equals(Integer.toString(count))) {
            int i = p.getCorrectAnswers();
            p.setCorrectAnswers(i + 1);
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect :(, the answer was "+count);
        }

        System.out.print("You have "+p.getCorrectAnswers()+" out of "+maxQ+" correct. \n\n");
    }

    public void playQuiz (int maxQuestions) {

        maxQ = maxQuestions;
        p.setCorrectAnswers(NULL);

        while (qCount < maxQuestions) {

            Algorithms a = new Algorithms();
            InsertionSort i = new InsertionSort();
            SelectionSort s = new SelectionSort();
            QuickSort qs = new QuickSort();

            a.initArray();
            randomAlgorithm();

            switch (randAlg) {

                case "Insertion Sort":
                    iterationQuestion();
                    i.insertionSort(a.array);
                    checkAnswer(i.finalCount);
                    qCount++;
                    break;

                case "Selection Sort":
                    iterationQuestion();
                    s.selectionSort(a.array);
                    checkAnswer(s.finalCount);
                    qCount++;
                    break;

                case "Quick Sort":
                    iterationQuestion();
                    qs.quickSort(a.array);
                    checkAnswer(qs.finalCount);
                    qCount++;
                    break;
            }
            System.out.println();
        }
    }
}
