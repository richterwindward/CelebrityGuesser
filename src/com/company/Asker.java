package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Asker {
    private TreeNode<String> currentQuestion;

    public Asker(TreeNode<String> rootQuestion) throws Exception {

        this.currentQuestion = rootQuestion;
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        while (true)
        {
            System.out.println(currentQuestion.getObject());
            String answer = buffer.readLine();
            if(answer.equalsIgnoreCase("y")) answerYes();
            else answerNo();

        }
    }

    public String getCurrentQuestion() {
        return (String) this.currentQuestion.getObject();
    }

    public void answerYes() {
        this.currentQuestion = this.currentQuestion.getLeft();
    }

    public void answerNo() {
        this.currentQuestion = this.currentQuestion.getRight();
    }
}
