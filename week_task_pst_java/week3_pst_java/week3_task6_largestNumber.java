import java.util.Arrays;
import java.util.Scanner;

public class Solution {

    // Method to arrange numbers such that they form the largest possible number
    public String largestNumber(int[] nums) {
        // Convert integer array to String array
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom comparator: compare (b + a) with (a + b) in descending order
        Arrays.sort(arr, (a, b) -> {
            String ab = a + b;
            String ba = b + a;
            return ba.compareTo(ab);
        });

        // If the largest number is "0", the result is just "0" (e.g., [0, 0])
        if (arr[0].equals("0")) {
            return "0";
        }

        // Build the final result string
        StringBuilder sb = new StringBuilder();
        for (String s : arr) {
            sb.append(s);
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // ------------------ Optional Dynamic Input ------------------
        System.out.println("\n--- Interactive Input Test ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        if (sc.hasNextInt()) {
            int n = sc.nextInt();
            int[] dynamicNums = new int[n];
            System.out.println("Enter " + n + " space-separated integers:");
            for (int i = 0; i < n; i++) {
                dynamicNums[i] = sc.nextInt();
            }
            System.out.println("Largest Formed Number: " + solution.largestNumber(dynamicNums));
        }
        sc.close();
    }
}