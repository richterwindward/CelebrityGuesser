package com.company.questions.male;

import com.company.questions.Question;
import com.company.TreeNode;


public class SalesmanQuestion extends Question
{
    public SalesmanQuestion() {
        super("Is this person a salesman?");
    }

    @Override
    public TreeNode<String> left() {
        return new GlassesQuestion();
    }

    @Override
    public TreeNode<String> right() {
        return new ManagerQuestion();
    }
}
