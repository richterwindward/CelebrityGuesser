package com.company.questions.male;

import com.company.questions.Answer;
import com.company.questions.Question;
import com.company.TreeNode;

public class JimQuestion extends Question
{
        public JimQuestion() {
            super("Are you thinking of Jim?");
        }

        @Override
        public TreeNode<String> left() {
            return new Answer("Jim",true);
        }

        @Override
        public TreeNode<String> right() {
            return new Answer("Andy",false);
        }
}
