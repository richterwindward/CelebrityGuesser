package com.company.questions.male;

import com.company.questions.Answer;
import com.company.questions.Question;
import com.company.TreeNode;

public class ManagerQuestion extends Question
{
    public ManagerQuestion() {
        super("Is this person a manager?");
    }

    @Override
    public TreeNode<String> left() {
        return new Answer("Michael",false);
    }

    @Override
    public TreeNode<String> right() {
        return new AccountantQuestion();
    }
}
