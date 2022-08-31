package HashTable;
//3. Longest Substring Without Repeating Characters
//Given a string s, find the length of the longest substring without repeating characters.

import java.util.*;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        LongestSubstringWithoutRepeatingCharacters l = new LongestSubstringWithoutRepeatingCharacters();
        System.out.println(l.lengthOfLongestSubstring("nfpdmpi"));
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> chars = new HashMap<>();
        char[] array = s.toCharArray();
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            if (chars.containsKey(array[i])) {

            } else {
                chars.put(array[i], i);
            }
        }
        return 0;
    }


//    public int lengthOfLongestSubstring(String s) {
//        if(s.length() == 0){
//            return 0;
//        }
//        List<String> substrings = new ArrayList<>();
//        substrings.add(Character.toString(s.charAt(0)));
//        int max = 1;
//        for (int i = 1; i < s.length(); i++) {
//            char temp = s.charAt(i);
//            String past = substrings.get(i - 1);
//            int index = past.indexOf(temp);
//            if (index == -1) {
//                String longer = past + temp;
//                substrings.add(longer);
//                max = Math.max(longer.length(), max);
//            } else {
//                substrings.add(past.substring(index + 1) + temp);
//            }
//        }
//        return max;
//    }


//    public int lengthOfLongestSubstring(String s) {
//        char[] array = s.toCharArray();
//        int max = 0;
//        for (int i = 0; i < array.length; i++) {
//            max = Math.max(lengthOfSubstring(array, i), max);
//        }
//
//        return max;
//
//    }
//
//    public int lengthOfSubstring(char[] array, int begin) {
//        int result = 0;
//        Set<Character> chars = new HashSet<>();
//        for (int i = begin; i < array.length; i++) {
//
//            if (chars.contains(array[i])) {
//                return result;
//            } else {
//                chars.add(array[i]);
//                result++;
//            }
//        }
//        return result;
//    }

}
