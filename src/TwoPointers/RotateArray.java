package TwoPointers;

import java.util.Arrays;

//189. Rotate Array
//Given an array, rotate the array to the right by k steps, where k is non-negative.
public class RotateArray {

    public static void main(String[] args) {
        int[] nums = new int[]{1, 2, 3, 4, 5, 6, 7};
        rotate(nums, 3);
        System.out.println(Arrays.toString(nums));
    }

    public static void rotate(int[] nums, int k) {
        int length = nums.length;
        int[] newArr = nums.clone();
        for (int i = 0; i < length; i++) {
            int temp = i + k;
            if (temp >= length) {
                temp = temp % (length);
            }
            nums[temp] = newArr[i];
        }
    }
}
