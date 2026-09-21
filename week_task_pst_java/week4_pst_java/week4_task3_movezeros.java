import java.util.*;

public class week4_task3_movezeros {

    public void moveZeroes(int[] nums) {
        int pos = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[pos++] = nums[i];
            }
        }
        while (pos < nums.length) {
            nums[pos++] = 0;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextInt()) return;
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        week4_task3_movezeros mv = new week4_task3_movezeros();
        mv.moveZeroes(nums);

        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + (i == n - 1 ? "" : " "));
        }
        System.out.println();
        sc.close();
    }
}