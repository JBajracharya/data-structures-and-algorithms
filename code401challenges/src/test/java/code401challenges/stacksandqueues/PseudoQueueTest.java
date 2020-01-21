package code401challenges.stacksandqueues;

import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

    @Test
    public void setEnqueueStack() {
        PseudoQueue queue = new PseudoQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        String expected = "4->3->2->1->FRONT";
        String actual = queue.toString();
        assertEquals(expected, actual);
    }

    @Test
    public void setDequeueStack() {
        PseudoQueue queue = new PseudoQueue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);

        queue.dequeue();
        String expected = "4->3->2->FRONT";
        String actual = queue.toString();
        assertEquals(expected, actual);

    }
}