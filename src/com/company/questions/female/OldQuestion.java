package com.company.questions.female;

import com.company.TreeNode;
import com.company.questions.male.Answer;
import com.company.questions.male.Question;

public class OldQuestion extends Question
{
    public OldQuestion() {
        super("Are they old?");
    }

    @Override
    public TreeNode<String> left()
    {
        return new Answer("It's phyllis!");
    }

    @Override
    public TreeNode<String> right()
    {
        return new Answer("It's karen!");
    }
}
