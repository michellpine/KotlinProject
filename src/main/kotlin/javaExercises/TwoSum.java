package javaExercises;

import java.util.Arrays;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {
        int[] positions = new int[2];
        boolean foundIt = false;
        for (int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target && !foundIt) {
                    positions[0] = i;
                    positions[1] = j;
                    foundIt = true;
                }
            }
        }
        return positions;
    }

    public static void main(String[] args) {
        int nums[] = {2,5,5,11};
        Arrays.stream(twoSum(nums, 10)).forEach(x -> System.out.println(x));
    }
}
