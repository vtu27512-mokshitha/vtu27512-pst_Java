import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2_JavaInstanceofKeyword {

    static class Person {
    }

    static class Student extends Person {
    }

    static class Rockstar extends Person {
    }

    static class Hacker extends Person {
    }

    static Person createPerson(String type) {
        if (type == null) {
            return new Person();
        }
        
        // Normalize input: remove whitespace and check case-insensitively
        String cleaned = type.trim();
        if (cleaned.equalsIgnoreCase("Student")) {
            return new Student();
        } else if (cleaned.equalsIgnoreCase("Rockstar")) {
            return new Rockstar();
        } else if (cleaned.equalsIgnoreCase("Hacker")) {
            return new Hacker();
        } else {
            return new Person();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) {
            return;
        }

        // Reads the number of entries
        int count = scanner.nextInt();

        List<Person> people = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            // scanner.next() reads the next single word token, avoiding newline/spacing bugs
            people.add(createPerson(scanner.next()));
        }

        int studentCount = 0;
        int rockstarCount = 0;
        int hackerCount = 0;

        for (Person person : people) {
            if (person instanceof Student) {
                studentCount++;
            } else if (person instanceof Rockstar) {
                rockstarCount++;
            } else if (person instanceof Hacker) {
                hackerCount++;
            }
        }

        System.out.println(studentCount + " " + rockstarCount + " " + hackerCount);
        scanner.close();
    }
}