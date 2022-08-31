package TwoPointers;

import java.io.*;

import sun.misc.*;

import java.util.Arrays;
import java.util.Base64;

//977. Squares of a Sorted Array
//Given an integer array nums sorted in non-decreasing order,
// return an array of the squares of each number sorted in non-decreasing order.

public class SquaresOfASortedArray {

    public static void main(String[] args) throws InterruptedException {

    }

    public int[] sortedSquares(int[] nums) {
        int[] ans = new int[nums.length];
        int start = 0, end = nums.length - 1;
        /*we'll start storing from the last index as we want the result array in decreasing order from the last*/
        int index = end;

        while (start <= end) {
            //comparing the squares of both pointer location elements
            if (nums[start] * nums[start] > nums[end] * nums[end]) {
                ans[index] = nums[start] * nums[start];
                index--;
                start++;
            } else {
                ans[index] = nums[end] * nums[end];
                index--;
                end--;
            }
        }

        return ans;
    }
}

