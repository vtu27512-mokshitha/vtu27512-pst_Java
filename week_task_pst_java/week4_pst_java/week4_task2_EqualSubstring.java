import java.util.*;

public class week4_task2_EqualSubstring {

    public static boolean isLapindrome(String s) {
        int len = s.length();
        int mid = len / 2;

        // For even length: [0, mid) and [mid, len)
        // For odd length: [0, mid) and [mid + 1, len) (skips the exact middle character)
        String first = s.substring(0, mid);
        String second = (len % 2 == 0) ? s.substring(mid) : s.substring(mid + 1);

        char[] a1 = first.toCharArray();
        char[] a2 = second.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);

        return Arrays.equals(a1, a2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String s = sc.nextLine().trim();
            if (isLapindrome(s)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}