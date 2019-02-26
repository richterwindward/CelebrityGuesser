package com.company;

import com.company.questions.Question;

public class Asker {
    private Question currentQuestion;

    public Asker(Question rootQuestion) {
        this.currentQuestion = rootQuestion;
    }

    public String getCurrentQuestion() {
        return this.currentQuestion.question();
    }

    public void answerYes() {
        this.currentQuestion = (Question)this.currentQuestion.left();
    }

    public void answerNo() {
        this.currentQuestion = (Question)this.currentQuestion.right();2
    }
}
