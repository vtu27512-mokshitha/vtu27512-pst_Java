import java.util.*;

public class week5_task6_SubarrayDivision {

    public static int birthday(List<Integer> s, int d, int m) {
        if (s.size() < m) return 0;
        int count = 0;
        int sum = 0;

        for (int i = 0; i < m; i++) {
            sum += s.get(i);
        }
        if (sum == d) {
            count++;
        }

        for (int i = m; i < s.size(); i++) {
            sum += s.get(i) - s.get(i - m);
            if (sum == d) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        List<Integer> s = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            s.add(sc.nextInt());
        }

        int d = sc.nextInt();
        int m = sc.nextInt();

        System.out.println(birthday(s, d, m));
        sc.close();
    }
}