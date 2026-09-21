import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class week6_task10_TwoStrings {

    public static String twoStrings(String s1, String s2) {
        Set<Character> set1 = new HashSet<>();
        for (char c : s1.toCharArray()) {
            set1.add(c);
        }
        for (char c : s2.toCharArray()) {
            if (set1.contains(c)) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        // Built-in verification test cases
        System.out.println("--- Hardcoded Tests ---");
        System.out.println("Input: s1 = hello, s2 = world -> Output: " + twoStrings("hello", "world")); // Output: YES ('l', 'o')
        System.out.println("Input: s1 = hi,    s2 = world -> Output: " + twoStrings("hi", "world"));    // Output: NO

        // Optional interactive input
        System.out.println("\n--- Interactive Test ---");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter string s1: ");
        if (sc.hasNext()) {
            String s1 = sc.next();
            System.out.print("Enter string s2: ");
            String s2 = sc.next();
            System.out.println("Result: " + twoStrings(s1, s2));
        }
        sc.close();
    }
}