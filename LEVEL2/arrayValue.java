// Java program to test if an array contains a specific value

public class arrayValue {

    public static boolean arrayContain(int[] arr, int item) {

        for (int n : arr) {
            if (item == n) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {

        int[] array1 = { 20, 452, 201, 2341, 001 };

        System.out.println(arrayContain(array1, 452));
    }
}
