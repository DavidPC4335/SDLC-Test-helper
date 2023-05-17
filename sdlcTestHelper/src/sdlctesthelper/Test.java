/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdlctesthelper;

import java.util.ArrayList;

/**
 *
 * @author Dapav8190
 */
public class Test {
    
    
private ArrayList<Question> incorrect = new ArrayList();
private ArrayList<Question> questions = new ArrayList();

    
    public Test(){
        
    }
    public Test(ArrayList<Question> q){
        this.questions = questions;
    }

public void add(Question q){
    questions.add(q);
}
public Question getQuestion(int i){
    return questions.get(i);
}
public boolean answerQuestion(int index, int answer){
    boolean corr = questions.get(index).answerQuestion(answer);
    if(!corr){
        incorrect.add(questions.get(index));
    }
    return corr;
}
        
public String getFeedback(){
    String fb = "SCORE: "+(getLength()-numIncorrect())+"/"+getLength() +"\n";
    for (int i = 0; i < incorrect.size(); i++) {
        fb += questions.indexOf(incorrect.get(i))+". "+incorrect.get(i).getFeedback()+"\n";
    }
    return fb;
}


public int getLength(){
    return questions.size();
}

public int numIncorrect(){
    return incorrect.size();
}
}
