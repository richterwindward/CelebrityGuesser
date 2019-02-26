package com.company.questions.female;

import com.company.TreeNode;
import com.company.questions.male.Question;

public class BlondQuestion extends Question
{
    public BlondQuestion() {
        super("Are they blond?");
    }

    @Override
    public TreeNode<String> left()
    {
        return new HollyQuestion();
    }

    @Override
    public TreeNode<String> right()
    {
        return new PamQuestion();
    }
}
