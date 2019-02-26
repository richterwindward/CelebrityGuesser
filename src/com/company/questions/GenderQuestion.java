package com.company.questions;

import com.company.TreeNode;
import com.company.questions.female.SalesWomanQuestion;
import com.company.questions.male.Question;
import com.company.questions.male.SalesmanQuestion;

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
