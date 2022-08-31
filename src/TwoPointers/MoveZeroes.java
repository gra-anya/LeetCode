package TwoPointers;
//283. Move Zeroes

//Given an integer array nums, move all 0's to the end of it while maintaining the relative order of the non-zero elements.
//Note that you must do this in-place without making a copy of the array.

public class MoveZeroes {
    public void moveZeroes(int[] nums) {

        int start = 0;
        int end = nums.length - 1;
        while (nums[start] != 0) {
            start++;
        }
        int index = start;

        while (start <= end) {
            start++;
            if (nums[start] != 0) {
                nums[index] = nums[start];
                nums[start] = 0;
                index++;
            }
        }
    }
}
