import java.util.Scanner;

public class week4_task4_halvesareAlike {

    public boolean halvesAreAlike(String s) {
        int count1 = 0, count2 = 0;
        int len = s.length();
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < len / 2; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count1++;
            }
        }
        for (int i = len / 2; i < len; i++) {
            if (vowels.indexOf(s.charAt(i)) != -1) {
                count2++;
            }
        }
        return count1 == count2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        week4_task4_halvesareAlike solution = new week4_task4_halvesareAlike();
        String s = sc.nextLine().trim();
        boolean result = solution.halvesAreAlike(s);
        System.out.println(result);
        sc.close();
    }
}