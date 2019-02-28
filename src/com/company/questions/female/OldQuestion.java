package com.company.questions.female;

import com.company.TreeNode;
import com.company.questions.Answer;
import com.company.questions.Question;

public class OldQuestion extends Question
{
    public OldQuestion() {
        super("Are they old?");
    }

    @Override
    public TreeNode<String> left()
    {
        return new Answer("phyllis",false);
    }

    @Override
    public TreeNode<String> right()
    {
        return new Answer("karen",false);
    }
}
