package com.company.questions;

import com.company.TreeNode;


public class GlassesQuestion extends Question{
    public GlassesQuestion() {
        super("Does this person have glasses?");
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
