package code401challenges.hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {
    static Hashtable<String, Integer> hashtable;

    @Before
    public void initial() {
        hashtable = new Hashtable<>();
        hashtable.add("Mark", 40);
        hashtable.add("Hong", 50);
        hashtable.add("Henry", 22);
        hashtable.add("Justin", 30);
        hashtable.add("Dustin", 10);
        hashtable.add("Ben", 12);
    }

    @Test
    public void testSize() {
        assertEquals(6, hashtable.size());
    }

    @Test
    public void isEmpty() {
        assertFalse(hashtable.isEmpty());
    }

    @Test
    public void get() {
        int actual1 = hashtable.get("Hong");
        int actual2 = hashtable.get("Ben");
        assertEquals(50, actual1);
        assertEquals(12, actual2);
    }

    @Test
    public void testContains() {
        assertTrue(hashtable.contains("Justin"));
        assertFalse(hashtable.contains("mar"));
        assertTrue(hashtable.contains("Henry"));
    }

    @Test
    public void testHash() {
        // initial range is set to the size of 10. So range is between 0 and 10
        assertEquals(5, hashtable.hash("Mark"));
        assertEquals(2, hashtable.hash("Bajracharya"));
        assertEquals(6, hashtable.hash("Hong"));
    }

    @Test
    public void testWrongKey() {
        assertNull(hashtable.get("Jim"));
        assertNull(hashtable.get("Moon"));
    }

    @Test
    public void testHandleCollision() {
        hashtable = new Hashtable<>();
        hashtable.add("Mark", 40);
        assertEquals(5, hashtable.hash("Mark"));
        hashtable.add("arMk", 22);
        assertEquals(5, hashtable.hash("arMk"));
        hashtable.add("kMar", 33);
        assertEquals(5, hashtable.hash("kMar"));

        int actual1  = hashtable.get("Mark");
        int actual2  = hashtable.get("arMk");
        int actual3  = hashtable.get("kMar");
        assertEquals(40, actual1);
        assertEquals(22, actual2);
        assertEquals(33, actual3);

    }
}