import java.util.*;

public class calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many scores:");
        int n = sc.nextInt();

        List<Integer> scores = new ArrayList<>();
        System.out.println("Enter " + n + " scores:");
        for (int i = 0; i < n; i++) {
            scores.add(sc.nextInt());
        }

        int total = scores.stream().mapToInt(Integer::intValue).sum();
        double average = scores.stream().mapToInt(Integer::intValue).average().orElse(0);
        int max = scores.stream().mapToInt(Integer::intValue).max().orElse(0);
        int min = scores.stream().mapToInt(Integer::intValue).min().orElse(0);

        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
        sc.close();
    }
}