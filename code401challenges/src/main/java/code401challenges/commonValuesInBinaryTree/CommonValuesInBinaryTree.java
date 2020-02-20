package code401challenges.commonValuesInBinaryTree;

import code401challenges.hashtable.Hashtable;
import code401challenges.tree.Node;
import code401challenges.tree.Tree;

import java.util.ArrayList;

public class CommonValuesInBinaryTree {
    Hashtable hashtable = new Hashtable();
    ArrayList list = new ArrayList();

    public ArrayList commonValuesInBinaryTree(Tree tree1, Tree tree2) {
         Node<Integer> node1 = tree1.root;
         Node<Integer> node2 = tree2.root;

         if(node1 != null) {
             if(!hashtable.contains(node1.data)) {
                 hashtable.add(node1.data, 1);
                 commonValuesInBinaryTree(node1.left, null);

             }



         }

    }




}
