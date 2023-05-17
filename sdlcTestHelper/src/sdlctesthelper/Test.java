/*
DaVid Pavlove Cunsolo & Calum Makenzie
2023/05/16
tyest class that contains an array list of questions and keeps track of progress
 */
package sdlctesthelper;

import java.util.ArrayList;

/**
 *
 * @author Dapav8190
 */
public class Test {
    
    
private ArrayList<Question> incorrect = new ArrayList();
private ArrayList<Question> questions;

    /**
     * main constructor that accpets an arraylist of questions loaded in
     * @param q arrayList of questions
     */
    public Test(ArrayList<Question> q){
        this.questions = q;
    }
    /**
     *empty Constructor that initialized test to blank array
     */
    public Test(){
    questions= new ArrayList();
    }
/**
 * adds question to list
 * @param q 
 */
public void add(Question q){
    questions.add(q);
}
/**
 * gets question at index
 * @param i
 * @return 
 */
public Question getQuestion(int i){
    return questions.get(i);
}

/**
 * answers question at index(adds to incorrect list if wrong)
 * @param index
 * @param answer
 * @return if the question was answered correctly
 */
public boolean answerQuestion(int index, int answer){
    boolean corr = questions.get(index).answerQuestion(answer);
    if(!corr){
        incorrect.add(questions.get(index));
    }
    return corr;
}
    

/**
 * gets a total list of all the feedback for the test
 * @return String of feedback 
 */
public String getFeedback(){
    String fb = "SCORE: "+(getLength()-numIncorrect())+"/"+getLength() +"\n";
    for (int i = 0; i < incorrect.size(); i++) {//loop throughh incorrect questions
        fb += questions.indexOf(incorrect.get(i))+". "+incorrect.get(i).getFeedback()+"\n";
        //add spoecific feedback
    }
    return fb;
}

/**\
 * getter for length of test
 * @return 
 */
public int getLength(){
    return questions.size();
}
/**
 * getter for number incorrect
 * @return 
 */
public int numIncorrect(){
    return incorrect.size();
}
}
