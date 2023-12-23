package javaExercises;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateLetters {

    public static String removeDuplicateLetters(String s) {
        String[] chars = s.split("");
        Set<String> result = new LinkedHashSet<>();
        for (int i=0; i<chars.length; i++) {
            if (i+1< chars.length && chars[i].compareTo(chars[i+1]) < 0 || (!result.contains(chars[i]) && !result.isEmpty())) {
                result.add(chars[i]);
            }
        }
        System.out.println(result.toString());
        return result.toString();
    }

    public static void main(String[] args) {
        removeDuplicateLetters("bcabc");
    }
}
