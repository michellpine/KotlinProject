package javaExercises;

import java.util.Arrays;

public class RotateArray {

    public static void rotate(int[] nums, int k) {
        int j=0;
        int[] rotateNums = new int[nums.length];
        while (j<k) {
            int last = nums[nums.length-1];
            rotateNums[0] = last;
            for (int i=0; i<nums.length-1; i++) {
                rotateNums[i+1] = nums[i];
            }
            nums = Arrays.stream(rotateNums).toArray();
            j++;
        }

        Arrays.stream(nums).forEach(x -> System.out.println(x));
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        rotate(nums, 3);
    }
}
