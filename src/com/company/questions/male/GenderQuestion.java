package com.company.questions.male;

import com.company.TreeNode;
import com.company.questions.female.SalesWomanQuestion;

public class GenderQuestion extends Question
{
    public GenderQuestion() {
        super("Is this person a male");
    }

    @Override
    public TreeNode<String> left() {
        return new SalesmanQuestion();
    }

    @Override
    public TreeNode<String> right() {
        return new SalesWomanQuestion();
    }
}
