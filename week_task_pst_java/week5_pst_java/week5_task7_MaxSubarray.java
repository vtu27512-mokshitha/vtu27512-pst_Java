import java.util.*;

public class week5_task7_MaxSubarray {

    public static List<Integer> maxSubarray(List<Integer> arr) {
        int currentSum = arr.get(0);
        int maxSubarray = arr.get(0);

        for (int i = 1; i < arr.size(); i++) {
            currentSum = Math.max(arr.get(i), currentSum + arr.get(i));
            maxSubarray = Math.max(maxSubarray, currentSum);
        }

        int maxSubsequence = 0;
        int largest = arr.get(0);

        for (int num : arr) {
            largest = Math.max(largest, num);
            if (num > 0) {
                maxSubsequence += num;
            }
        }

        if (maxSubsequence == 0) {
            maxSubsequence = largest;
        }

        return Arrays.asList(maxSubarray, maxSubsequence);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            List<Integer> arr = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                arr.add(sc.nextInt());
            }

            List<Integer> result = maxSubarray(arr);
            System.out.println(result.get(0) + " " + result.get(1));
        }
        sc.close();
    }
}