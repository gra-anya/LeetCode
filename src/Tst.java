import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tst {
    public static void main(String[] args) {
//        List<String> numbers = new ArrayList(Arrays.asList("first", "second", "third"));
//        for (String number : numbers) {
//            if ("third".equals(number)) {
//                numbers.add("fourth");
//            }
//        }
//        System.out.println(numbers.size());

        char aChar = 'a';
        char four = '4';
        System.out.println(Character.isDigit(aChar));
        System.out.println((Character.isDigit(four)));
        System.out.println(Integer.parseInt(String.valueOf(four)));

        char[] array = "Z123XY".toCharArray();
        int length = 0;


        for (int i = 0; i < array.length; ) {

            if (!Character.isDigit(array[i]) && ((i + 1) == array.length || !Character.isDigit(array[i + 1]))) {
                length++;
                i++;
            } else {
                i++;
                StringBuilder result = new StringBuilder();
                while (i < array.length && Character.isDigit(array[i])) {
                    result.append(array[i]);
                    i++;
                }
                length += Integer.parseInt(r esult.toString());
            }

        }
        System.out.println(length);

    }
}
