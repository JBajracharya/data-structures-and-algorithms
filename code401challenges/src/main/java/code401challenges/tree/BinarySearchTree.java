package code401challenges.tree;

import java.util.ArrayList;

public class BinarySearchTree{
    ArrayList<Integer> list = new ArrayList<>();

    public ArrayList<Integer> preOrder(Node node) {
        if(node != null) {
            list.add(node.data);
            preOrder(node.left);
            preOrder(node.right);
        }
        return list;
    }

    public ArrayList<Integer> inOrder(Node node) {
        if(node != null) {
            preOrder(node.left);
            list.add(node.data);
            preOrder(node.right);
        }
        return list;
    }

    public ArrayList<Integer> postOrder(Node node) {
        if(node != null) {
            postOrder(node.left);
            postOrder(node.right);
            list.add(node.data);
        }
        return list;
    }

    public boolean contains( Node root, int value) {
        list =  postOrder(root);
        for (int val: list) {
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
