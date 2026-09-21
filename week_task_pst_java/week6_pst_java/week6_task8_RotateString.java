import java.util.Scanner;

public class week6_task8_RotateString {

    public static boolean rotateString(String s, String goal) {
        return s.length() == goal.length() && (s + s).contains(goal);
    }

    public static void main(String[] args) {
        // Built-in verification test cases
        System.out.println("--- Hardcoded Tests ---");
        System.out.println("Input: s = abcde, goal = cdeab -> Output: " + rotateString("abcde", "cdeab")); // Output: true
        System.out.println("Input: s = abcde, goal = abced -> Output: " + rotateString("abcde", "abced")); // Output: false

        // Optional interactive input
        System.out.println("\n--- Interactive Test ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s and goal (separated by space): ");
        if (sc.hasNext()) {
            String s = sc.next();
            String goal = sc.next();
            System.out.println("Result: " + rotateString(s, goal));
        }
        sc.close();
    }
}