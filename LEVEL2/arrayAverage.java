// Calculate average of an array 

public class arrayAverage {

    public static void main(String[] args) {

        int[] nums = { 1, 2, 3, 4, 5 };
        System.out.println(average(nums));

    }

    public static double average(int[] nums) {

        double sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        return sum / nums.length;
    }
}