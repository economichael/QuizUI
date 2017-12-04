import java.util.ArrayList;
public class MultipleChoiceQuestion extends ShortAnswerQuestion {

    ArrayList<String> possibleAnswers = new ArrayList<>();
    String actualAnswer;
    
    public MultipleChoiceQuestion() {
    		//do nothing
    }
    
    public MultipleChoiceQuestion(String question, ArrayList<String> possibleAnswers) {
    		super(question, possibleAnswers);
    }
    
    public MultipleChoiceQuestion (String question, ArrayList<String> possibleAnswers, String actualAnswer){
    		this.question = question;
    		this.actualAnswer = actualAnswer;
        this.possibleAnswers = possibleAnswers;
    }

    @Override
    public String askQuestion() {
        return super.askQuestion();
    }
    
    @Override
    public boolean check(String userAnswer){
        return userAnswer.equals(actualAnswer);
    }

    @Override
    public MultipleChoiceQuestion clone(){
        return new MultipleChoiceQuestion(super.askQuestion(), this.possibleAnswers, this.actualAnswer);
    }
    
    public void setPossibleAnswers (ArrayList<String> possibleAnswers){
        this.possibleAnswers = possibleAnswers;
    }
    public ArrayList<String> getPossibleAnswers(){
        return possibleAnswers;
    }
    
    public void setActualAnswer(String actualAnswer) {
    		this.actualAnswer = actualAnswer;
    }

    @Override
    public String toString(){
        return askQuestion();
    }
}
