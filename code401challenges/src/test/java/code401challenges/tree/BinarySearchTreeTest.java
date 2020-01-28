package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class BinarySearchTreeTest {

    static Tree tree;
    static BinarySearchTree searchTree;
    @Before
    public void initial(){
        tree = new Tree();
        searchTree = new BinarySearchTree();
        tree.insert(20);
        tree.insert(10);
        tree.insert(30);
        tree.insert(5);
        tree.insert(15);
        tree.insert(16);
    }

    @Test
    public void testPreOrder() {
        ArrayList<Integer> list = searchTree.preOrder(tree.root);
        assertEquals("[20, 10, 5, 15, 16, 30]", list.toString());
    }

    @Test
    public void testInOrder(){
        ArrayList<Integer> list = searchTree.inOrder(tree.root);
        assertEquals("[10, 5, 15, 16, 20, 30]", list.toString());
    }

    @Test
    public void testPostOrder(){
        ArrayList<Integer> list = searchTree.postOrder(tree.root);
        assertEquals("[5, 16, 15, 10, 30, 20]", list.toString());
    }

    @Test
    public void testContains(){
        System.out.println(searchTree.contains(tree.root, 15));
    }
}