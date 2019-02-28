package com.company.questions.male;

import com.company.TreeNode;
import com.company.questions.Answer;
import com.company.questions.Question;


public class GlassesQuestion extends Question
{
    public GlassesQuestion() {
        super("Does this person have glasses?");
    }

    @Override
    public TreeNode<String> left() {
        return new Answer("Dwight",false);
    }

    @Override
    public TreeNode<String> right() {
        return new CaucasianQuestion();
    }
}
