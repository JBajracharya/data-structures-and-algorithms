package code401challenges.linkedList;

import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListTest {
    @Test
    public void testEmptyList() {
        LinkedList list = new LinkedList();
        assertNull("Expected null", list.head);

    }

    @Test
    public void testInsertAndPrintValues() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(13);
        list.insert(2);
        list.insert(31);

        String expected = "{31}->{2}->{13}->{30}->{10}->NULL";
        String actual = list.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void testIncludesValue() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(13);
        list.insert(2);
        list.insert(31);

        int input1 = 2;
        int input2 = 50;
        System.out.println("expected2 = " + list.includes(input1));
        assertTrue("Expected true", list.includes(input1));
        assertFalse("Expected false", list.includes(input2));

    }

    @Test
    public void testHead() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(40);

        assertEquals("Expected true", 40, list.head.value);
    }

    @Test
    public void testValueExists() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(40);

        assertFalse("expected: false", list.includes(50));

    }

    ////////////////////// Challenge 6 /////////////////////////////
    @Test
    public void testAppendToLinkList() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(40);
        list.append(55);
        list.append(33);
        String expected = "{40}->{30}->{10}->{55}->{33}->NULL";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testInsertBefore() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(40);
        list.append(55);
        list.insertBefore(55, 83);

        String expected = "{40}->{30}->{10}->{83}->{55}->NULL";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testInsertAfter() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(40);
        list.append(55);
        list.insertAfter(55, 83);

        String expected = "{40}->{30}->{10}->{55}->{83}->NULL";
        String actual = list.toString();

        assertEquals(expected, actual);
    }

    @Test
    public void testKthFromEnd() {
        LinkedList list = new LinkedList();
        list.insert(10);
        list.insert(30);
        list.insert(13);
        list.insert(2);
        list.insert(31);
        list.toString();
        System.out.println("111111  " + list.kthFromEnd(6));
    }

    @Test
    public void linkedListTest() {
        LinkedList list1 = new LinkedList();
        list1.insert(10);
        list1.insert(30);
        list1.insert(13);
        list1.insert(2);
        list1.insert(31);

        LinkedList list2 = new LinkedList();
        list2.insert(10);
        list2.insert(30);
        list2.insert(13);
        list2.insert(2);
//        list2.insert(31);

        LinkedList.mergeLists(list1, list2);


    }
}