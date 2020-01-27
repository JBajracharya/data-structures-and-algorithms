package code401challenges.tree;

public class Node {
    int data;
    Node left;
    Node right;


    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

    public Node(int data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
