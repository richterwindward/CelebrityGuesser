package com.company.questions.male;

import com.company.TreeNode;

public class JimQuestion extends Question{
        public JimQuestion() {
            super("Are you thinking of Jim?");
        }

        @Override
        public TreeNode<String> left() {
            return new Answer("It's Jim!");
        }

        @Override
        public TreeNode<String> right() {
            return new Answer("It's Andy!");
        }
}
