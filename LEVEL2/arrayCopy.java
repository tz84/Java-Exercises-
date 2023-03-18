// Copy an array by iterating the array 

import java.util.Arrays;

public class arrayCopy {
    public static void main(String[] args) {

        int[] array1 = { 2, 1231, 123, 90, 2, 2134, 41, 41 };
        int[] array2 = new int[10];

        System.out.println("Original array : " + Arrays.toString(array1));

        for (int i = 0; i < array1.length; i++) {
            array2[i] = array1[i];
        }
        System.out.println("New array: " + Arrays.toString(array2));

    }
}