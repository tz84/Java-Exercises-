// Sort numeric and string array 

import java.util.Arrays;

public class arrayStringNumSort {
    public static void main(String[] args) {

        int[] arrayNum = { 10, 9, 1999, 231, 45, 213, 501, 4321 };

        String[] arrayStr = { "hi", "zoinks", "hello", "hey", "absurd", "welcome", "world" };

        System.out.println("First array is unsorted, the second is sorted");
        System.out.println(Arrays.toString(arrayNum));
        Arrays.sort(arrayNum);
        System.out.println(Arrays.toString(arrayNum));

        System.out.println("First array is unsorted, the second is sorted");
        System.out.println(Arrays.toString(arrayStr));
        Arrays.sort(arrayStr);
        System.out.println(Arrays.toString(arrayStr));
    }
}