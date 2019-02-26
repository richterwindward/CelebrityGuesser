package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
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
            s.append(this.object.toString());
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

    public static TreeNode deserialize(String s) {
    //    System.out.println(s);
        /*(
        if(s == null || s.equals("") || s.equals(" "))
            return null;
        String[] tokens = s.split(" ");
        String token = tokens[0];
        TreeNode<String> node = new TreeNode<>(token);

        if(tokens[1].equals("*")) node.setLeft(null); else node.setLeft(deserialize(s.replace(token + " ", "").replace(token, "")));
        if(tokens[2].equals("*")) node.setRight(null); else  node.setRight(deserialize(s.replace(token + " " + (tokens.length > 1 ? tokens[1] + " " : ""), "").replace(token, "")));
        return node;
        */

        if(s == null || s.equals("") || s.equals(" ") || s.equals("*"))
            return null;
        String[] tokens = s.split(" ");
        List<String> tokensList = Arrays.asList(tokens);
        String head = tokensList.get(0);
        tokensList.remove(0);
        TreeNode<String> node = new TreeNode<>(head);
        node.setLeft(deserialize(tokensList.toString()));
        return null;
    }

}
