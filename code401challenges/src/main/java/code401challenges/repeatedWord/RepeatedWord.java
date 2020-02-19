package code401challenges.repeatedWord;

import code401challenges.hashtable.Hashtable;

public class RepeatedWord {

    public static String firstRepeatedWord(String string) {
        String[] words = string.split("\\s+|, \\s*|\\.\\s* |\\?\\s*");
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        for (String w: words) {
            if(!hashtable.contains(w.toLowerCase())) {
                hashtable.add(w.toLowerCase(), 1);
            } else {
                System.out.println("w = " + w);
                return w;
            }
        }

        return null;
    }
}
