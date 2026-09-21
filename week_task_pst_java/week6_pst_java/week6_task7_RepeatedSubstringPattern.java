import java.util.Scanner;

public class week6_task7_RepeatedSubstringPattern {

    public static boolean repeatedSubstringPattern(String s) {
        String doubled = s + s;
        return doubled.substring(1, doubled.length() - 1).contains(s);
    }

    public static void main(String[] args) {
        // Built-in verification test cases
        System.out.println("--- Test Results ---");
        System.out.println("Input: abab         -> Output: " + repeatedSubstringPattern("abab"));
        System.out.println("Input: aba          -> Output: " + repeatedSubstringPattern("aba"));
        System.out.println("Input: abcabcabcabc -> Output: " + repeatedSubstringPattern("abcabcabcabc"));

        // Interactive console input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter a string: ");
        if (sc.hasNext()) {
            String s = sc.next();
            System.out.println("Result: " + repeatedSubstringPattern(s));
        }
        sc.close();
    }
}