package com.company.questions.male;

import com.company.TreeNode;

public abstract class Question extends TreeNode<String> {

    private String question;

    public Question(String question) {
        super(question);
        this.question = question;
    }

    public String question() {
        return question;
    }



    public abstract TreeNode<String> left();

    public abstract TreeNode<String> right();

    @Override
    public void setRight(TreeNode right) {
        throw new IllegalStateException();
    }

    @Override
    public void setLeft(TreeNode left) {
        throw new IllegalStateException();
    }

    @Override
    public TreeNode getLeft() {
        return left();
    }

    @Override
    public TreeNode getRight() {
        return right();
    }
}
