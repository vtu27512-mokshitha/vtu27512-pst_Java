import java.util.*;
import java.util.stream.*;

public class streampipeline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many numbers:");
        int n = sc.nextInt();

        List<Integer> numbers = new ArrayList<>();
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            numbers.add(sc.nextInt());
        }

        List<Integer> result = numbers.stream()
                                      .distinct()                // remove duplicates
                                      .filter(num -> num > 20)   // greater than 20
                                      .map(num -> num * 2)       // multiply by 2
                                      .sorted()                  // sort ascending
                                      .collect(Collectors.toList());

        System.out.println("Final result: " + result);
        sc.close();
    }
}