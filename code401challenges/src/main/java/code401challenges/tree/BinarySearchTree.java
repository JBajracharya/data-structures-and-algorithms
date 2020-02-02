package code401challenges.tree;

import code401challenges.stacksandqueues.Queue;

import java.util.ArrayList;

import static java.lang.Integer.MIN_VALUE;
//import java.util.Queue;

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

    public ArrayList<T> breadthFirst(Node<T> root) {

        Queue<Node> queue = new Queue<Node>();
        if(root != null){
            queue.enqueue(root);
        }
        while (!queue.isEmpty()) {
            Node<T> temp = queue.dequeue();
            System.out.println("temp = " + temp);
            list.add(temp.data);

            if(temp.left != null) {
                queue.enqueue(temp.left);
            }
            if (temp.right != null) {
                queue.enqueue(temp.right);
            }
        }
        return list;
    }

    public int getMaxValue(Node<T> root) throws Exception {
        //add exception
        if(root.data.getClass().getName() != "java.lang.Integer") {
            throw new Exception("tree data type must be integers");
        }
        if(root == null) {
            throw new Exception("tree must have some value");
        }
        System.out.println("root.data.getClass().getName() = " + root.data.getClass().getName());
        Queue<Node> queue = new Queue<Node>();
        int max = MIN_VALUE;
        if(root != null){
            queue.enqueue(root);
        }
        while (!queue.isEmpty()) {
            Node<Integer> temp = queue.dequeue();
            if(max < temp.data){
                max = temp.data;
            }

            if(temp.left != null) {
                queue.enqueue(temp.left);
            }
            if (temp.right != null) {
                queue.enqueue(temp.right);
            }
        }
        return max;
    }

}
