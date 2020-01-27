package code401challenges.tree;

import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTreeTest {
    @Test
    public void testInsert(){
        BinarySearchTree tree = new BinarySearchTree();
        Node root  = null;
        tree.add(20);
        tree.add(10);
        tree.add(30);
        tree.add(5);
        tree.add(15);
        tree.add(16);

        // 8, 3, 5, 10, 15, 2, 6, 14
    }
}