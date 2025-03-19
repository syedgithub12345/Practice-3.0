import java.util.*;
public class kadane {
    public static int maxSubArraySum(int[] arr) {
        int maxSoFar = Integer.MIN_VALUE;
        int maxEndingHere = 0;

        for (int num : arr) {
            maxEndingHere += num;
            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }
            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }
        return maxSoFar;
    }

    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println("Maximum contiguous sum is " + maxSubArraySum(arr));
    }
}
