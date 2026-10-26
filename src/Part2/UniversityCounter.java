package Part2;

// Part 2
// Task 1 The University Counter
public class UniversityCounter {

    public static void main(String[] args) {

        Student lastStudent = null;

        for (int i = 1; i <= 5; i++) {
            lastStudent = new Student("Student " + i);
        }

        System.out.println("Part 2 Task 1: Last student ID = " + lastStudent.getId());
    }
}