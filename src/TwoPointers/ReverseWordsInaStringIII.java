package TwoPointers;
//557. Reverse Words in a String III
//Given a string s,
// reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order

public class ReverseWordsInaStringIII {
    public String reverseWords(String s) {
        StringBuilder builder = new StringBuilder();
        String[] strings = s.split(" ");
        for (String str : strings) {
            char[] temp = str.toCharArray();
            reverseString(temp);
            builder.append(temp).append(" ");
        }
        return builder.toString().trim();
    }


    public void reverseString(char[] s) {
        int end = s.length;
        for (int i = 0; i < end / 2; i++) {
            char temp = s[i];
            s[i] = s[end - 1 - i];
            s[end - 1 - i] = temp;
        }
    }
}