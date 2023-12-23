package javaExercises;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Palindrome {
    public boolean isPalindrome(int x) {
        List<String> result = new ArrayList<>();
        char[] digits = String.valueOf(x).toCharArray();
        for (int i=digits.length; i >=0; i--) {
            result.add(String.valueOf(digits[i]));
        }
        return x == parseInt(result.toString());
    }

    public static void main(String[] args) {
        MorseCodeDecoder.decode("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
    }
}
