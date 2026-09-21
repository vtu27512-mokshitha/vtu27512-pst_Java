import java.util.*;

public class week5_task5_SearchPattern {

    public static List<Integer> search(String pat, String txt) {
        int m = pat.length();
        int n = txt.length();
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= n - m; i++) {
            int j;
            for (j = 0; j < m; j++) {
                if (txt.charAt(i + j) != pat.charAt(j)) {
                    break;
                }
            }
            if (j == m) {
                ans.add(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String txt = sc.next();
        String pat = sc.next();

        List<Integer> result = search(pat, txt);
        for (int i = 0; i < result.size(); i++) {
            System.out.print(result.get(i) + (i == result.size() - 1 ? "" : " "));
        }
        System.out.println();
        sc.close();
    }
}