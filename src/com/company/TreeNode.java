package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TreeNode<T> {
    private TreeNode left;
    private TreeNode right;
    private T object;

    public TreeNode() {}
    public TreeNode(T o) {
        this.object = o;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(T object) {
        this.object = object;
    }

    public String serialize() {
        StringBuilder s = new StringBuilder();

        if(this.getObject() == null) {
            s.append("*");
        } else {
            s.append(this.object.toString().replace(" ","_"));
        }

        s.append(' ');


        if(this.getLeft() != null) {
            s.append(this.getLeft().serialize());
        } else s.append("* ");
        if(this.getRight() != null) {
            s.append(this.getRight().serialize());
        } else  s.append("* ");

        // s.append(this.getLeft() != null ? this.getLeft().serialize() : '');
        // s.append(this.getRight().serialize());
        return s.toString();
    }

    public static TreeNode deserialize(ArrayList<String> tokens) {
        if(tokens.size() == 0 || tokens.get(0).equals("*"))
            return null;
        String head = tokens.remove(0).replace("_"," ");
        TreeNode<String> root = new TreeNode<>(head);
        root.setLeft(deserialize(tokens));
        root.setRight(deserialize(tokens));
        return root;
    }

    public static ArrayList<String> generateTokensFromString(String s) {
        return new ArrayList<String>(Arrays.asList(s.split(" ")));
    }
}
