import java.util.ArrayList;
public class MultipleChoiceQuestion extends Question {

    ArrayList<String> possibleAnswers = new ArrayList<>();

    public MultipleChoiceQuestion (String question, String answer, ArrayList<String> possibleAnswers){
        super(question, answer);
        this.possibleAnswers = possibleAnswers;
    }

    //sup
    @Override
    public String askQuestion() {
        String ret = "";
        ret += super.askQuestion() + "\n";
        for(int i = 0; i < possibleAnswers.size(); i++){
            ret += possibleAnswers.get(i) + "\n";
        }
        return ret;
    }

    @Override
    public MultipleChoiceQuestion clone(){
        return new MultipleChoiceQuestion(super.askQuestion(), super.getAnswer(), possibleAnswers);
    }
    public void setPossibleAnswers (ArrayList<String> possibleAnswers){
        this.possibleAnswers = possibleAnswers;
    }
    public ArrayList<String> getPossibleAnswers(){
        return possibleAnswers;
    }

    @Override
    public String toString(){
        return askQuestion();
    }
}
