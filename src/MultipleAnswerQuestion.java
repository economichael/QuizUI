import java.util.ArrayList;
public class MultipleAnswerQuestion extends MultipleChoiceQuestion {

    ArrayList<String> allAnswers = new ArrayList<>();
    ArrayList<String> actualAnswers = new ArrayList<>();
    
    public MultipleAnswerQuestion(String question, ArrayList<String> allAnswers, ArrayList<String> actualAnswers){
    		super(question, allAnswers);
        this.allAnswers = allAnswers;
        this.actualAnswers = actualAnswers;
    }

    @Override
    public String askQuestion() {
        return super.askQuestion();
    }
    
    public boolean check(ArrayList<String> userAnswer){
        if (userAnswer.size() != actualAnswers.size()) {
        		return false;
        }
        
        for (int i = 0; i < userAnswer.size(); i++) {
        		if (!actualAnswers.contains(userAnswer.get(i))) {
        			return false;
        		}
        }
        
        return true;
    }

    @Override
    public MultipleChoiceQuestion clone(){
        return new MultipleChoiceQuestion(super.askQuestion(), this.allAnswers, this.actualAnswer);
    }
    
    public void setPossibleAnswers (ArrayList<String> possibleAnswers){
        this.allAnswers = possibleAnswers;
    }
    
    public ArrayList<String> getPossibleAnswers(){
        return this.allAnswers;
    }
    
    public void setActualAnswers (ArrayList<String> possibleAnswers){
        this.actualAnswers = possibleAnswers;
    }
    
    public ArrayList<String> getActualAnswers(){
        return actualAnswers;
    }   

    @Override
    public String toString(){
        return askQuestion();
    }
}
