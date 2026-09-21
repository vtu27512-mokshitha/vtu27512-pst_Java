import java.util.Scanner;

public class week6_task5_MarsExploration {
    public static int marsExploration(String s) {
        int count = 0;
        String target = "SOS";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != target.charAt(i % 3)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String s = sc.next();
            System.out.println(marsExploration(s));
        } else {
            System.out.println(marsExploration("SOSSPSSQSSOR"));
        }
        sc.close();
    }
}