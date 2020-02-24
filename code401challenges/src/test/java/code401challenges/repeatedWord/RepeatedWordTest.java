package code401challenges.repeatedWord;

import org.junit.Test;

import static org.junit.Assert.*;


public class RepeatedWordTest {

    @Test
    public void firstRepeatedWord() {
        String string = "It was a queer, sultry summer?, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        assertEquals("summer", RepeatedWord.firstRepeatedWord(string));
    }

    @Test
    public void testEmptyString(){
        String emptyString = "";
        assertNull(RepeatedWord.firstRepeatedWord(emptyString));
    }

    @Test
    public void testNoRepeatedWord() {
        String unrepeatedWord = "I like to play soccer. Playing sports is every good for health.";
        assertNull(RepeatedWord.firstRepeatedWord(unrepeatedWord));
    }
}