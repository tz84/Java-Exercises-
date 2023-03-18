// Reverse an array of integer values

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int[] my_array1 = {123, 1234, 5231, 103, 45, 4123, 1009, 5840};

        System.out.println("Original array : " + Arrays.toString(my_array1));

        for (int i = 0; i < my_array1.length / 2; i++) {
            int temp = my_array1[i];
            my_array1[i] = my_array1[my_array1.length - i - 1];
            my_array1[my_array1.length - i - 1] = temp;

        }
        System.out.println("Reverse array : " + Arrays.toString(my_array1));
    }
}