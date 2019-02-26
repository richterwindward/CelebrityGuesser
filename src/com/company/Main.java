package com.company;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        TreeNode<Integer> root = new TreeNode<>(3);
        root.setLeft(new TreeNode<>(7377));
        root.setRight(new TreeNode<>(777));
        root.getRight().setLeft(new TreeNode<>(23));

        // System.out.println(root.serialize());
        List<String> s = new ArrayList<>();
        s.add("fef");
        s.add("3222");
        System.out.println(s.toString());
    }
}
