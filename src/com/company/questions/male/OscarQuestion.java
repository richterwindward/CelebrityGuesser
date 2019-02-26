package com.company.questions.male;

import com.company.questions.Answer;
import com.company.questions.Question;
import com.company.TreeNode;

public class OscarQuestion extends Question
{
    public OscarQuestion() {
        super("Are you thinking of Oscar?");
    }

    @Override
    public TreeNode<String> left() {
        return new Answer("It's Oscar!");
    }

    @Override
    public TreeNode<String> right() {
        return new Answer("It's Kevin!");
    }
}
