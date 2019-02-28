package com.company.questions.male;

import com.company.questions.Answer;
import com.company.questions.Question;
import com.company.TreeNode;

public class CaucasianQuestion extends Question
{
    public CaucasianQuestion() {
        super("Is this person caucasian?");
    }

    @Override
    public TreeNode<String> left() {
        return new JimQuestion();
    }

    @Override
    public TreeNode<String> right() {
        return new Answer("Stanley",false);
    }
}
