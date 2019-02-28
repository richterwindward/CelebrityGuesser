package com.company.questions.female;

import com.company.TreeNode;
import com.company.questions.Answer;
import com.company.questions.Question;

public class PamQuestion extends Question
{
    public PamQuestion() {
        super("Is it Pam?");
    }

    @Override
    public TreeNode<String> left()
    {
        return new Answer("It's pam!", true);
    }

    @Override
    public TreeNode<String> right()
    {
        return new Answer("It's Meredith!", false);
    }
}
