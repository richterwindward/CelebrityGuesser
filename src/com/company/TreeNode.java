package com.company;

public class TreeNode<T> {
    private TreeNode left;
    private TreeNode right;
    private T object;

    private static final String JSON_FORMAT = "{" +
            "\"left\": %s," +
            "\"right\": %s," +
            "\"object\": %s" +
            "}"
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
        s.append(this.object.toString());
        s.append(' ');
        s.append(this.getLeft() != null ? this.getLeft().serialize() : '*');
        s.append(this.getRight() != null ? this.getRight().serialize() : '*');
        return s.toString();
    }

    public static TreeNode deserialize(String s) {
        return null;
    }

}
