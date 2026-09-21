import java.util.Scanner;

public class week6_task6_PalindromeIndex {

    public static int palindromeIndex(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                if (isPalindrome(s, left + 1, right)) {
                    return left;
                }
                if (isPalindrome(s, left, right - 1)) {
                    return right;
                }
                return -1;
            }
            left++;
            right--;
        }
        return -1;
    }

    private static boolean isPalindrome(String s, int left, int right) {
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        // Built-in verification test cases
        System.out.println("--- Hardcoded Tests ---");
        System.out.println("Input: aaab -> Output: " + palindromeIndex("aaab")); // Output: 3
        System.out.println("Input: baa  -> Output: " + palindromeIndex("baa"));  // Output: 0
        System.out.println("Input: aaa  -> Output: " + palindromeIndex("aaa"));  // Output: -1

        // Optional interactive input
        System.out.println("\n--- Interactive Test ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        if (sc.hasNext()) {
            String input = sc.next();
            System.out.println("Result: " + palindromeIndex(input));
        }
        sc.close();
    }
}