import java.util.Scanner;

public class week6_task3_FindTheIndexOfTheFirstOccurrenceInAString {
    public static int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (sc.hasNext()) {
            String haystack = sc.next();
            String needle = sc.next();
            System.out.println(strStr(haystack, needle));
        } else {
            System.out.println(strStr("sadbutsad", "sad"));
        }
        sc.close();
    }
}