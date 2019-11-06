import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        Student bob = new Student("bob", 16, 2, new ArrayList<>(Arrays.asList(new Course("English","learn to speak english", "A"),
                new Course("Intro to programming", "learn the basic concepts of programming", "B-"))));
        Student bob2 = new Student("bob", 16, 3, new ArrayList<>(Arrays.asList(new Course("English","learn to speak english", "A"),
                new Course("Intro to programming", "learn the basic concepts of programming", "B-"))));

        Collections.addAll(students, bob, bob2);

        for (Student s: students) {
            System.out.println(s.displayText());
        }

    }
}
