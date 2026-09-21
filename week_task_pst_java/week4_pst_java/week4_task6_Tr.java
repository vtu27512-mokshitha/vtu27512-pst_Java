import java.util.*;

public class week4_task6_Tr {

    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<>();
        int alice = 0;
        int bob = 0;
        for (int i = 0; i < 3; i++) {
            if (a.get(i) > b.get(i)) {
                alice++;
            } else if (a.get(i) < b.get(i)) {
                bob++;
            }
        }
        res.add(alice);
        res.add(bob);
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            a.add(sc.nextInt());
        }

        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            b.add(sc.nextInt());
        }

        List<Integer> result = compareTriplets(a, b);
        System.out.println(result.get(0) + " " + result.get(1));
        sc.close();
    }
}