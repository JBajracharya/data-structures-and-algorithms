package code401challenges.tree;

//source: https://www.youtube.com/watch?v=81PpYQ0AN_w
public class Tree {

    Node root;

    public void insert(int value){
        root = insert(root, value);
    }

    //overloading a method
    private Node insert(Node node, int val) {
        if(node == null) {
            Node root = new Node(val);
            return root;
        }
        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if(val > node.data) {
            node.right = insert(node.right, val);
        }
        return node;
    }
}
