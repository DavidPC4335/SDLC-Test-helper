/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdlctesthelper;

/**
 *
 * @author Dapav8190
 */
public class Question {
    private String question;
private String[] answers;
private int correctIndex;
private String feedback;
public Question(String question,String[] answers,int correctIndex){
    this.question = question;
    this.answers = answers.clone();
    this.correctIndex = correctIndex;
}
public Question(String question,String answer1,String  answer2,String answer3,String answer4,int correctIndex,String feedback){
    
}
public boolean answerQustion(int i){
    return i==correctIndex;
}

public String getQuestion(int i){
    return answers[i];
}

public String getFeedback(){
    return feedback;
}
}