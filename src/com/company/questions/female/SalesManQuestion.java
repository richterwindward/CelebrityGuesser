package com.company.questions.female;

import com.company.TreeNode;
import com.company.questions.male.Question;

public class SalesManQuestion extends Question
{
    public SalesManQuestion() {
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
