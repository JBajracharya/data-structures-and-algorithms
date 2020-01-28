package code401challenges.utilities;

import code401challenges.tree.BinarySearchTree;
import code401challenges.tree.Tree;

import java.util.ArrayList;

public class FizzBuzzTree {
    BinarySearchTree searchTree;
    public void fizzBuzzTree(Tree tree) {

        ArrayList<Integer> list = searchTree.preOrder(tree.root);
    }
}
