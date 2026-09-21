import java.util.Scanner;

public class week5_task7_TimeConversion {

    public static String timeConversion(String s) {
        int hour = Integer.parseInt(s.substring(0, 2));
        char meridiem = s.charAt(8);

        if (meridiem == 'A') {
            if (hour == 12) {
                hour = 0;
            }
        } else { // 'P'
            if (hour != 12) {
                hour += 12;
            }
        }

        return String.format("%02d", hour) + s.substring(2, 8);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        System.out.println(timeConversion(s));
        sc.close();
    }
}