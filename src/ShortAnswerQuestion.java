import java.util.ArrayList;

public class ShortAnswerQuestion{
    protected String question;
    protected ArrayList<String> acceptableAnswers = new ArrayList<>();;
    
    public ShortAnswerQuestion(){
    		//do nothing
    }

    public ShortAnswerQuestion(String question, ArrayList<String> acceptableAnswers){
        this.question = question;
        this.acceptableAnswers = acceptableAnswers;
    }
    public String askQuestion(){
        return question;
    }
    
    public boolean check(String userAnswer){
        return acceptableAnswers.contains(userAnswer);
    }
    
    public void setQuestion(String question){
        this.question = question;
    }
    
    public void setAnswers(ArrayList<String> acceptableAnswers) {
    		this.acceptableAnswers = acceptableAnswers;
    }
    
    @Override
    public ShortAnswerQuestion clone(){
        return new ShortAnswerQuestion(question, acceptableAnswers);
    }
    	//sup
    @Override
    public String toString(){
        return question;
    }
}