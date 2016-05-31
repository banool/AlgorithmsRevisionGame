/**
 * Created by Brad on 31/05/2016.
 */
public class Player {

    public Player(/*String firstName, int correctAnswers*/){
        /*this.firstName = firstName;
        this.correctAnswers = correctAnswers;*/
    }

    private String firstName;
    private int correctAnswers;

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
