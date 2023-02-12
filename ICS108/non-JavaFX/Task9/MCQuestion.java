package Task9;

public class MCQuestion extends Question {
    private String[] choices;

    public MCQuestion(String question, String[] choices) {
        super(question);
        this.choices = choices;
    }
    public String toString() {
        String text = super.toString() + "?\n";
        for (int i = 0; i < choices.length; i++) {
            text += +i+1+": " + choices[i] + "\n";
        }
        return text;
    }
    
}
