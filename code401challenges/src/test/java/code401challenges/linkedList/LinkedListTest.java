package code401challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test public void testEmptyList () {
        LinkedList list = new LinkedList();
        assertNull("Expected null", list.head);

    }

    @Test public void testInsertAndPrintValues() {
        LinkedList  list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(13);
        list.insert(2);
        list.insert(31);

        String expected = "{31}->{2}->{13}->{30}->{10}->NULL";
        String actual = list.printValues();
        assertEquals(expected, actual);
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

    @Test public void testHead() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(40);

        assertEquals("Expected true", 40, list.head.value);
    }

    @Test public void testValueExists() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(40);

        assertFalse("expected: false", list.includes(50));

    }

    ////////////////////// Challenge 6 /////////////////////////////
    @Test public void testAppendToLinkList(){
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(40);
        list.append(55);
        list.append(33);
        String expected = "{40}->{30}->{10}->{55}->{33}->NULL";
        String actual = list.printValues();

        assertEquals(expected, actual);
    }

    @Test public void testInsertBefore (){
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(40);
        list.append(55);
        list.insertBefore(55, 83);

        String expected = "{40}->{30}->{10}->{83}->{55}->NULL";
        String actual = list.printValues();

        assertEquals(expected, actual);
    }
}