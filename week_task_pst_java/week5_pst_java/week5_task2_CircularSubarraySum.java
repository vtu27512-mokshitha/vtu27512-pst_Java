import java.util.*;

public class week5_task2_CircularSubarraySum {

    public static int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int currentMax = nums[0];
        int maxSum = nums[0];
        int currentMin = nums[0];
        int minSum = nums[0];

        for (int num : nums) {
            currentMax = Math.max(num, currentMax + num);
            maxSum = Math.max(maxSum, currentMax);

            currentMin = Math.min(num, currentMin + num);
            minSum = Math.min(minSum, currentMin);

            totalSum += num;
        }

        if (maxSum < 0) {
            return maxSum;
        }

        int circularSum = totalSum - minSum;
        return Math.max(maxSum, circularSum);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int result = maxSubarraySumCircular(nums);
        System.out.println(result);
        sc.close();
    }
}
