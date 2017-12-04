import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Quiz {
    ArrayList<Question> holdQuestions = new ArrayList<>();
        //private Question[] holdQuestions;
        //private int index;
        private String filename;

        // Modify the Quiz class’ constructor to acnept a filename that will be used in the save method described below.
    public Quiz (int numQuestions, String filename){
            //holdQuestions = new Question[numQuestions];
            holdQuestions = new ArrayList<>();
            this.filename = filename;
        }

        // save method, save the question text (and possible answers if MCQ) of all questions associated with that quiz into a file
        // The filename provided to the constructor will be used as the filename for saving a quiz.
    public void save (){
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))){
            bw.write(toString());
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    //sup
    // addQuestion method receives Question object, add to array of questions in the quiz
    public void addQuestion (Question question){
        holdQuestions.add(question);
        //holdQuestions[index] = question;
        //index++;
    }

    //Override the toString method in Quiz so that it returns a String containing the text from all questions in the quiz.
    @Override
    public String toString(){
        String ret = "";
        for (int i = 0; i < holdQuestions.size(); i++) {
            ret += (i+1) + ". " + holdQuestions.get(i) + "\n";
        }
        return ret;
    }
}
