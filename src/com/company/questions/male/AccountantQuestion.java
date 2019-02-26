package com.company.questions.male;

import com.company.TreeNode;

public class AccountantQuestion extends Question{
    public AccountantQuestion() {
        super("Is this person an accountant?");
    }

    @Override
    public TreeNode<String> left() {
        return new OscarQuestion();
    }

    @Override
    public TreeNode<String> right() {
        return new Answer("It's Creed!");
    }
}