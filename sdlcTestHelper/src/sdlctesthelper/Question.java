/*
Men
May 14-17 2023
Questions class for SDLC project
 */
package sdlctesthelper;

/**
 *
 * @author Dapav8190
 */
public class Question {

    //declaring priavte variables
    private String question;
    private String[] answers;
    private int correctIndex;
    private String feedback;

    /**
     * constructor method for question class
     *
     * @param question - the string of the question being asked
     * @param answers - the string array of possible answers
     * @param correctIndex - the integer index of the correct answer
     * @param feedback - the string message to give the user if they answer
     * incorrectly
     */
    public Question(String question, String[] answers, int correctIndex, String feedback) {
        //setting the priavte variables to the entered parameters
        this.question = question;
        this.answers = answers.clone();
        this.correctIndex = correctIndex;
        this.feedback = feedback;
    }

    /**
     * method that returns the answer for the current question
     *
     * @param i - the index of the answer entered for the question
     * @return - the index of the correct answer to the question
     */
    public boolean answerQuestion(int i) {
        return i == correctIndex;
    }

    /**
     * getter method for the answer the user entered as a string
     *
     * @param i - the index of the user answer
     * @return - the answer that the user entered for that index
     */
    public String getAnswer(int i) {
        return answers[i];
    }

    /**
     * getter method for the question being asked
     *
     * @return - the string question being asked
     */
    public String getQuestion() {
        return question;
    }

    /**
     * getter method for the feedback of the question
     *
     * @return - the string feedback
     */
    public String getFeedback() {
        return feedback;
    }
}
