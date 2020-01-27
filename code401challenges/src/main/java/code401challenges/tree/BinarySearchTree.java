package code401challenges.tree;

public class BinarySearchTree {
    Node root;

    public void add(int value){
        root = insert(root, value);
    }

    public Node insert(Node node, int val) {
        if(node == null) {
            Node newNode = new Node(val);
            return newNode;
        }
        if(val < node.data) {
            node.left = insert(node.left, val);
        } else if(val > node.data) {
            node.right = insert(node.right, val);
        }
        return node;
    }


}
