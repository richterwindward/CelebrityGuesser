package com.company.questions.male;

import com.company.questions.Answer;
import com.company.questions.Question;
import com.company.TreeNode;

public class AccountantQuestion extends Question
{
    public AccountantQuestion() {
        super("Is this person an accountant?");
    }

    @Override
    public TreeNode<String> left() {
        return new OscarQuestion();
    }

    @Override
    public TreeNode<String> right() {
        return new Answer("It's Creed!", false);
    }
}