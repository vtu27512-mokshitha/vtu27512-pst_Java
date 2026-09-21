import java.util.*;

public class week4_task1_DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        int n = arr.size();
        int d1 = 0;
        int d2 = 0; 
        for (int i = 0; i < n; i++) {
            d1 += arr.get(i).get(i);
            d2 += arr.get(i).get(n - i - 1);
        }
        return Math.abs(d1 - d2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();

        List<List<Integer>> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < n; j++) {
                row.add(sc.nextInt());
            }
            arr.add(row);
        }

        int result = diagonalDifference(arr);
        System.out.println(result);
        sc.close();
    }
}