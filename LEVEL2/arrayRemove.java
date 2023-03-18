
// Remove specific element from an array 
import java.util.Arrays;

public class arrayRemove {

    public static void main(String[] args) {

        int[] array1 = { 2, 13, 100, 1231, 3, 54, 1, 90, 123, 547 };

        System.out.println("Original Array = " + Arrays.toString(array1));

        int removeIndex = 2;

        for (int i = removeIndex; i < array1.length - 1; i++) {
            array1[i] = array1[i + 1];
        }

        System.out.println("Third element removed" + Arrays.toString(array1));
    }
}