package com.company.questions;

import com.company.TreeNode;

public class GenderQuestion extends Question
{
    public GenderQuestion() {
        super("Is this person a male");
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
