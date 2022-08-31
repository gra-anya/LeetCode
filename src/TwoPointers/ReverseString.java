package TwoPointers;//344. Reverse String
//Write a function that reverses a string. The input string is given as an array of characters s.
//You must do this by modifying the input array in-place with O(1) extra memory.

public class ReverseString {
    public void reverseString(char[] s) {
        int end = s.length;
        for (int i = 0; i < end / 2; i++) {
            char temp = s[i];
            s[i] = s[end - 1 - i];
            s[end -1 - i] = temp;
        }

    }
}
