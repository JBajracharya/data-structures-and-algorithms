package code401challenges.commonValuesInBinaryTree;

import code401challenges.tree.Tree;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import static org.junit.Assert.*;


public class CommonValuesInBinaryTreeTest {
    Tree tree1 = new Tree();
    Tree tree2 = new Tree();

    @Before
    public void init() {
        tree1.insert(150);
        tree1.insert(100);
        tree1.insert(250);
        tree1.insert(75);
        tree1.insert(160);
        tree1.insert(200);
        tree1.insert(350);
        tree1.insert(125);
        tree1.insert(175);
        tree1.insert(300);
        tree1.insert(500);

        tree2.insert(42);
        tree2.insert(100);
        tree2.insert(600);
        tree2.insert(15);
        tree2.insert(160);
        tree2.insert(200);
        tree2.insert(350);
        tree2.insert(125);
        tree2.insert(175);
        tree2.insert(4);
        tree2.insert(500);
    }

    @Test
    public void testCommonValuesInBinaryTree() {
        ArrayList<Integer> list = CommonValuesInBinaryTree.commonValuesInBinaryTree(tree1, tree2);
        String actual = list.toString();
        String expected = "[100, 160, 125, 200, 175, 350, 500]";

        assertEquals(expected, actual);
    }

    @Test
    public void testEmptyTrees(){
        Tree emptyTree1 = new Tree();
        Tree emptyTree2 = new Tree();

        ArrayList<Integer> list = CommonValuesInBinaryTree.commonValuesInBinaryTree(emptyTree1, emptyTree2);
        String actual = list.toString();
        String expected = "[]";

        assertEquals(expected, actual);
    }

    @Test
    public void testOneEmptyTree() {
        Tree tree = new Tree();
        Tree emptyTree = new Tree();

        tree.insert(2);
        tree.insert(10);
        tree.insert(0);
        tree.insert(2);
        tree.insert(5);

        ArrayList<Integer> list = CommonValuesInBinaryTree.commonValuesInBinaryTree(emptyTree, tree);
        String actual = list.toString();
        String expected = "[]";

        assertEquals(expected, actual);
    }

}