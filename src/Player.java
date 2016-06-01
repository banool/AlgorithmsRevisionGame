/**
 * Created by Brad on 31/05/2016.
 */
public enum Player {

    INSTANCE;
    private String firstName;
    private int correctAnswers;


    public void getInstance(String command) {
        switch (command) {
            case "firstName":
                System.out.print(firstName);
                break;

            case "correctAnswers":
                System.out.print(correctAnswers);
        }
    }

    public String getFirstName () {
        return firstName;
    }

    public void setFirstName (String firstName) {
        this.firstName = firstName;
    }

    public int getCorrectAnswers () {
        return correctAnswers;
    }

    public void setCorrectAnswers (int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

}
