package code401challenges.repeatedWord;

import org.junit.Test;

public class RepeatedWordTest {

    @Test
    public void firstRepeatedWord() {
        String string = "It was a queer, sultry summer?, the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...";
        RepeatedWord.firstRepeatedWord(string);
    }
}