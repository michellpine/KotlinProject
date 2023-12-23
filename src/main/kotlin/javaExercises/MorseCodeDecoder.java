package javaExercises;

import java.util.Arrays;

public class MorseCodeDecoder {
    public static String decode(String numbers) {
        String[] numbersWithoutSpace = numbers.split(" ");
        Integer maxNum = Arrays.stream(numbersWithoutSpace).map(Integer::parseInt).max(Integer::compare).get();
        Integer minNum = Arrays.stream(numbersWithoutSpace).map(Integer::parseInt).min(Integer::compare).get();
        System.out.println("max " + maxNum);
        System.out.println("min " + minNum);
        return maxNum + " " + minNum;
    }

    public static void main(String[] args) {
        MorseCodeDecoder.decode("8 3 -5 42 -1 0 0 -9 4 7 4 -4");
    }
}
