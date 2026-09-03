import java.util.Scanner;

public class caplockstream {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        System.out.print("Uppercase string: ");

        input.chars()
             .map(Character::toUpperCase)
             .forEach(c -> System.out.print((char) c));

        sc.close();
    }
}