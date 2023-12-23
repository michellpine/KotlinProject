package javaExercises;

import java.util.*;

public class LongesthSubstring {

    public static int lengthOfLongestSubstring(String s) {
        Set<Character> hash = new HashSet<>();
        int i=0, j=0, max=0;
        int len = s.length();
        while (j < len) {
            if (!hash.contains(s.charAt(j))) {
                hash.add(s.charAt(j++));
                max = Math.max(max,hash.size());
            } else {
                hash.remove(s.charAt(i++));
            }
        }
        return  max;
    }

    public static void main(String[] args) {
        lengthOfLongestSubstring("pwwkew");
    }

    /*
    public int lengthOfLongestSubstring(String s) {
        String[] letters = s.split("");
        List<String> letterNotRepetead = new ArrayList<>();
        for (int i=0; i<letters.length; i++) {
            if (i != letters.length -1 && !Objects.equals(letters[i], letters[i + 1]) && !letterNotRepetead.contains(letters[i])) {
                letterNotRepetead.add(letters[i]);
            } else if (i != letters.length -1 ) {
                letterNotRepetead.add(".");
            } else if (letterNotRepetead.isEmpty()) {
                letterNotRepetead.add(letters[i]);
            }
        }

        Long count = letterNotRepetead.stream().filter(x -> !x.equals(".")).count();
        return count == 0 ? 1 : count.intValue();
    }
     */
}
