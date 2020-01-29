package code401challenges.utilities;

import code401challenges.tree.BinarySearchTree;
import code401challenges.tree.Node;

public class FizzBuzzTree {
    public static BinarySearchTree<String> fizzBuzzTree(BinarySearchTree<String> tree) {
        BinarySearchTree<String> newTree = new BinarySearchTree<>();
        newTree.root = traverse(tree.root);
        return newTree;
    }

    public static Node<String> traverse(Node<String> node){
        if(node == null) {
            return null;
        }

        //postOrder node
        Node<String> left = traverse(node.left);
        Node<String> right = traverse(node.right);

        Node<String> newNode = new Node<>(node.data);
        newNode.data = replaceWithFizzBuzz(node.data);
        newNode.left = left;
        newNode.right = right;

        return newNode;
    }

    private static String replaceWithFizzBuzz(String number) {
        int num = Integer.parseInt(number);
        if (num % 3 == 0 && num % 5 == 0) {
            return "fizzBuzz";
        }else if(num % 3 == 0) {
            return "fizz";
        } else if(num % 5 == 0) {
            return "buzz";
        } else {
            return number;
        }
    }

}
