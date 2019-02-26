package com.company.questions.female;

import com.company.TreeNode;
import com.company.questions.male.Answer;
import com.company.questions.male.Question;

public class HollyQuestion extends Question
{
    public HollyQuestion() {
        super("Are they holly?");
    }

    @Override
    public TreeNode<String> left()
    {
        return new Answer("It's holly!");
    }

    @Override
    public TreeNode<String> right()
    {
        return new Answer("It's Angela!");
    }
}
