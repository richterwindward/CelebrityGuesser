package com.company;

import com.company.questions.GenderQuestion;

public class Main {

    public static void main(String[] args) throws Exception {
        TreeNode original;
        TreeNode male = new GenderQuestion();
        // System.out.println(male.serialize());
        // original = TreeNode.deserialize(TreeNode.generateTokensFromString(male.serialize()));
        System.out.println("Welcome to Office Akinator!\nThis program will try to guess who your office character is with a series of questions\nTo play, type y for Yes, n for No.\nEnjoy!");
	    original = male;
        new Asker(original);
    }
}
