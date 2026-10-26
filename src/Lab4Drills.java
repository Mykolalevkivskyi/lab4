//Part 1 Syntax & Logic Drills (Quickfire)
// Drill1 The Forbidden Access

public class Lab4Drills {
    String name = "Nick";

    public static void Drill1() {
        // System.out.println(name);
        // Error: non-static variable name cannot be referenced from a static context

        System.out.println("Drill1: Static method cannot directly access a non-static variable.");

    }

// Drill2 Varargs Math
public static void Drill2() {
        int result = sum(10, 20, 30);
        System.out.println("Drill2: Sum = " + result);
}

public static int sum(int... numbers) {
        int total = 0;

        for(int number : numbers){
            total = total + number;

        }

        return total;

    }

    // Drill3: Varargs Rule-breaker
    public static void Drill3() {
        // public static void test(int... nums, String s) {}
        // Error: Vararg parameter must be the last in the list

        test("Drill3: Number = ", 10, 20, 30);
    }

    public static void test(String s, int... nums) {
        for (int number : nums) {
            System.out.println(s + number);
        }
    }

    // Drill4 The Default Ghost
    public static void Drill4() {
        // MyClass test = new MyClass();
        // Error: constructor MyClass in class MyClass cannot be applied to given types
        // Required: java.lang.String
        // Found: no arguments
        // Reason: actual and formal argument lists differ in length

        new MyClass("Nick");
    }

    // Drill5: Constructor Chain
    public static void Drill5() {
        new ConstructorChain();
    }

    // Drill6: Static Call Practice
    public static void Drill6() {
        double result1 = Math.sqrt(144);
        int result2 = Integer.parseInt("100");

        System.out.println("Drill6: Math.sqrt(144) = " + result1);
        System.out.println("Drill6: Integer.parseInt(\"100\") = " + result2);

        // Both methods are static (class methods).
        // They can be called without creating an object.
    }

    // Drill7: Final Parameter
    public static void Drill7() {
        change(5);
    }

    public static void change(final int x) {
        //x = 10;
        //Error: final parameter x may not be assigned
        System.out.println("Drill7: x = " + x);
    }

    // Drill8: The Identity Crisis
    public static void Drill8() {
        Lab4Drills object = new Lab4Drills();
        object.showIdentity();
    }

    public void showIdentity() {
        System.out.println("Drill8: " + this);
    }

    // Drill10: Shadowing Fix
    public static void Drill10() {
        Student student = new Student("Nick");
        student.showName();
    }

}

// Drill4: The Default Ghost - Constructor
class MyClass {

    MyClass(String name) {
        System.out.println("Drill4: Object created for " + name);
    }
}

// Drill5 Constructor Chain - Constructors
class ConstructorChain {

    ConstructorChain() {
        this("Nick");
        System.out.println("Drill5: First constructor");
    }

    ConstructorChain(String name) {
        System.out.println("Drill5: Second constructor, name = " + name);
    }

}

// Drill10: Shadowing Fix - Student Class
class Student {

    String name;

    Student(String name) {
        // name = name; // Incorrect: field is not initialized
        this.name = name;
    }

    public void showName() {
        System.out.println("Drill10: Student name = " + name);
    }
}

