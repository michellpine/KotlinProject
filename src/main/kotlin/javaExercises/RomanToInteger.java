package javaExercises;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static Map<String, Integer> getRomanNums() {
        Map<String, Integer> romanNums = new HashMap<String, Integer>();
        romanNums.put("I", 1);
        romanNums.put("V", 5);
        romanNums.put("X", 10);
        romanNums.put("L", 50);
        romanNums.put("C", 100);
        romanNums.put("D", 500);
        romanNums.put("M", 1000);
        return romanNums;
    }

    public static int romanToInt(String s) {
        int result = 0;
        if (s.length() >= 1 && s.length() <= 15) {
            String[] romanNumbers = s.split("");
            for (int i=0; i<romanNumbers.length; i++) {
                if (i != romanNumbers.length -1 && romanNumbers[i].equals("I") && romanNumbers[i + 1].equals("V")) {
                   result += 4;
                   i++;
                   continue;
                }
                if (i != romanNumbers.length -1 && romanNumbers[i].equals("I") && romanNumbers[i + 1].equals("X")) {
                    result += 9;
                    i++;
                    continue;
                }
                if (i != romanNumbers.length -1 && romanNumbers[i].equals("X") && romanNumbers[i + 1].equals("L")) {
                    result += 40;
                    i++;
                    continue;
                }
                if (i != romanNumbers.length -1 && romanNumbers[i].equals("X") && romanNumbers[i + 1].equals("C")) {
                    result += 90;
                    i++;
                    continue;
                }
                if (i != romanNumbers.length -1 && romanNumbers[i].equals("C") && romanNumbers[i + 1].equals("D")) {
                    result += 400;
                    i++;
                    continue;
                }
                if (i != romanNumbers.length -1 && romanNumbers[i].equals("C") && romanNumbers[i + 1].equals("M")) {
                    result += 900;
                    i++;
                    continue;
                }
                result += getRomanNums().get(romanNumbers[i]);
            }
        }
        return result;
    }


    public static void main(String[] args) {
        System.out.println("Output: " + romanToInt("MMCDXXV"));
    }
}
