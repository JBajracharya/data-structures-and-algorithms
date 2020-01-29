package code401challenges.tree;

import java.util.ArrayList;

public class BinarySearchTree<T>{
    public Node<T> root;

    ArrayList<T> list = new ArrayList<>();

    public ArrayList<T> preOrder(Node<T> node) {
        if(node != null) {
            list.add(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }

        return list;
    }

    public ArrayList<T> inOrder(Node<T> node) {
        if(node != null) {
            preOrder(node.left);
            list.add(node.data);
            preOrder(node.right);
        }
        return list;
    }

    public ArrayList<T> postOrder(Node<T> node) {
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            list.add(node.data);
        }
        return list;
    }

    public boolean contains( Node<T> root, T value) {
        list =  postOrder(root);
        for (T val: list) {
            if(val == value) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Integer> breadthFirst(Tree tree) {

    }

    public int height(Node node) {
        if (node == null) {
            return 0;
        } else {
            int leftHeight = height(node.left);
            int rightHeight = height(node.right);
        }
    }
}
