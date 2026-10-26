package Part2;

// Part 2
// Task 3 The Memory Lab
public class PassByValueTest {

    // Method 1 Swap two numbers
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    // Method 2 Change student's name
    public static void changeName(Student s) {
        s.name = "Changed";
    }

    // Method 3 Replace student
    public static void replaceStudent(Student s) {
        s = new Student("New Person");
    }

    public static void main(String[] args) {

        // Test 1 Swap
        int a = 10;
        int b = 20;

        System.out.println("Before swap: a = " + a + ", b = " + b);
        swap(a, b);
        System.out.println("After swap: a = " + a + ", b = " + b);

        // Test 2 Change Name
        Student student = new Student("Nick");

        System.out.println("Before changeName: " + student.name);
        changeName(student);
        System.out.println("After changeName: " + student.name);

        // Test 3: Replace Student
        System.out.println("Before replaceStudent: " + student.name);
        replaceStudent(student);
        System.out.println("After replaceStudent: " + student.name);

        // Summary:
        // changeName worked because both references point to the same object.
        // replaceStudent failed because only a local copy of the reference was changed.
        // swap failed because Java passes copies of primitive values.
    }
}
