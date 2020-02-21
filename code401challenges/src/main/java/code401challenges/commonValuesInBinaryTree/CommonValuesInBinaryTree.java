package code401challenges.commonValuesInBinaryTree;

import code401challenges.tree.Node;
import code401challenges.tree.Tree;

import java.util.ArrayList;
import java.util.HashSet;

public class CommonValuesInBinaryTree {

    static HashSet hashtable = new HashSet();
    static ArrayList list = new ArrayList();

    public static ArrayList<Integer> commonValuesInBinaryTree(Tree tree1, Tree tree2) {
         Node<Integer> node1 = tree1.root;
         Node<Integer> node2 = tree2.root;

         getDuplicates(node1);
         getDuplicates(node2);
         return list;
    }

    public static void getDuplicates(Node<Integer> node) {
        if(node != null) {
            if(!hashtable.contains(node.data)) {
                hashtable.add(node.data);
            } else {
                list.add(node.data);
            }
            getDuplicates(node.left);
            getDuplicates(node.right);
        }
    }
}
