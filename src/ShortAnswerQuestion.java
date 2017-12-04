import java.util.ArrayList;

public class ShortAnswerQuestion{
    protected String question;
    protected ArrayList<String> allAnswers = new ArrayList<>();;
    
    public ShortAnswerQuestion(){
    		//do nothing
    }

    public ShortAnswerQuestion(String question, ArrayList<String> acceptableAnswers){
        this.question = question;
        this.allAnswers = acceptableAnswers;
    }
    public String askQuestion(){
        return question;
    }
    
    public boolean check(String userAnswer){
        return allAnswers.contains(userAnswer);
    }
    
    public void setQuestion(String question){
        this.question = question;
    }
    
    public void setAnswers(ArrayList<String> acceptableAnswers) {
    		this.allAnswers = acceptableAnswers;
    }
    
    public ArrayList<String> getAnswers() {
		return allAnswers;
}
    
    @Override
    public ShortAnswerQuestion clone(){
        return new ShortAnswerQuestion(question, allAnswers);
    }
    	//sup
    @Override
    public String toString(){
        return question;
    }
}