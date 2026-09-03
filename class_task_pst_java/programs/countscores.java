import java.util.*;


public class countscores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many scores:");
        int n = sc.nextInt();

        List<Integer> scores = new ArrayList<>();
        System.out.println("Enter " + n + " scores:");
        for (int i = 0; i < n; i++) {
            scores.add(sc.nextInt());
        }

        long count = scores.stream()
                           .filter(score -> score > 75)
                           .count();

        System.out.println("Students scoring above 75: " + count);
        sc.close();
    }
}