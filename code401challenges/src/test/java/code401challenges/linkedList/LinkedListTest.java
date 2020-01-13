package code401challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testLinkedList() {
        LinkedList  list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(13);
        list.insert(2);
        list.insert(31);

        list.PrintValues();
    }

    @Test public void testIncludesValue() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(13);
        list.insert(2);
        list.insert(31);

        int input1 = 2;
        int input2 = 50;
        System.out.println("expected2 = " + list.includes(input1));
        assertTrue( "Expected true",list.includes(input1));
        assertFalse("Expected false", list.includes(input2));

    }
}