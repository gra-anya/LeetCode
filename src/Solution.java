
import java.util.Arrays;


//Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n),
// ans[i] is the number of 1's in the binary representation of i.

class Solution {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(0)));
    }

    public static int[] countBits(int n) {
        int[] result = new int[n + 1];
        if (n == 0) {
            return result;
        }
        result[0] = 0;
        result[1] = 1;
        int temp = 2;
        for (int i = 2; i <= n; i++) {
            if (temp * 2 == i) {
                temp *= 2;
            }
            result[i] = 1 + result[i - temp];
        }
        return result;
    }
}