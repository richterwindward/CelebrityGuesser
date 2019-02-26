package com.company.questions;

import com.company.TreeNode;

public class GenderQuestion extends Question
{
    public GenderQuestion() {
        super("Male or Female");
    }

    @Override
    public TreeNode<String> left() {
        return null;
    }

    @Override
    public TreeNode<String> right() {
        return null;
    }
}
