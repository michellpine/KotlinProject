package javaExercises;

public class BinarySearch {

    public static int search(int[] nums, int target) {
        int position = -1;
        for (int i=0; i<nums.length; i++) {
            if (nums[i] == target) {
                position = i;
            }
        }

        return position;
    }

    public static void main(String[] args) {
        int[] nums = {-1,0,3,5,9,12};
        System.out.println(search(nums, 9));
    }
}
