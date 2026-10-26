package Part2;

// Part 2
// Task 1 The University Counter

public class Student {

    String name;
    int id;

    static int studentCount = 0;

    public Student(String name) {
        this.name = name;
        studentCount++;
        this.id = studentCount;
    }

    public int getId() {
        return id;
    }
}
