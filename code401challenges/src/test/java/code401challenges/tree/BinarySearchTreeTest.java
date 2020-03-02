package code401challenges.tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {

    @Test
    public void testEmptyTree() {
        Tree emptyTree = new Tree();
        assertNull(emptyTree.root);
    }

    @Test
    public void testSingleRootNode() {
        Tree singleRootNodeTree = new Tree();
        singleRootNodeTree.root = new Node<>(4);
        assertNotNull(singleRootNodeTree.root);
    }

    @Test
    public void testLeftChildRightChild() {
        Tree leftRightTree = new Tree();
        leftRightTree.root = new Node<>(1);
        leftRightTree.root.left = new Node<>(5);
        leftRightTree.root.right = new Node<>(8);
        assertEquals("[1, 5, 8]", leftRightTree.preOrder(leftRightTree.root).toString());
    }

    static Tree tree;
    static BinarySearchTree<Integer> searchTree;

    @Before
    public void initial() {
        tree = new Tree();
        searchTree = new BinarySearchTree<>();
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
        for (int a : list) {
            System.out.println("a = " + a);
        }
        assertEquals("[20, 10, 5, 15, 16, 30]", list.toString());
    }

    @Test
    public void testInOrder() {
        ArrayList<Integer> list = searchTree.inOrder(tree.root);
        assertEquals("[5, 10, 15, 16, 20, 30]", list.toString());
    }

    @Test
    public void testPostOrder() {
        ArrayList<Integer> list = searchTree.postOrder(tree.root);
        assertEquals("[5, 16, 15, 10, 30, 20]", list.toString());
    }

    @Test
    public void testContains() {
        assertTrue(searchTree.contains(tree.root, 15));
        assertTrue(searchTree.contains(tree.root, 30));
        assertFalse(searchTree.contains(tree.root, 50));

    }

    @Test
    public void testBreadthFirst() {
        assertEquals("[20, 10, 30, 5, 15, 16]", searchTree.breadthFirst(tree.root).toString());
    }


    @Test
    public void testMaxValueInTree() throws Exception {
        assertEquals(30, searchTree.getMaxValue(tree.root));
    }

    @Test
    public void testNegativeMax() throws Exception {
        Tree tree1 = new Tree();
        tree1.insert(-20);
        tree1.insert(-10);
        tree1.insert(-30);
        tree1.insert(-5);
        tree1.insert(-15);
        tree1.insert(-16);

        assertEquals(-5, searchTree.getMaxValue(tree1.root));
    }

    @Test(expected = Exception.class)
    public void testWrongDataTypeError() throws Exception {
        BinarySearchTree<String> stringTree = new BinarySearchTree<>();
        stringTree.root = new Node<>("Ball");
        int actual = stringTree.getMaxValue(stringTree.root);
        assertEquals(5, actual);
    }
}

