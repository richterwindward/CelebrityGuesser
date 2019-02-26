package com.company.questions.female;

import com.company.TreeNode;
import com.company.questions.Question;

public class SalesWomanQuestion extends Question
{
    public SalesWomanQuestion() {
        super("Are they a salesman?");
    }

    @Override
    public TreeNode<String> left()
    {
        return new OldQuestion();
    }

    @Override
    public TreeNode<String> right()
    {
        return new BlondQuestion();
    }


}
