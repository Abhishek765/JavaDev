package accessModifierExample;

import accessModifierExample.other.*;

/**
 ** private - members accessible within the same class only
 ** public - members with public access modifier can be accessible anywhere
 ** (across packages as well)
 ** default - members with no manual access modifier (public, private, protected)
 ** are `default` by default. This is accessible within the same package
 ** protected - Can be accessible in the same class, same package subclasses and
 ** different packages but only within subclasses
 */

class C extends ProtectedExample {
    public int showProtectedMarks() {
        return protectedMarks;
    }
}

public class Demo {
    public static void main(String[] args) {
        Student student = new Student();
        // ! System.out.println(student.marks); // marks is private instance variable
        // ! can't be accessed outside the class

        B b = new B();
        int roll_no[] = b.getRollNo();

        System.out.println("roll_no 1: " + roll_no[3]);

        C c = new C();
        System.out.println("Protected Marks: " + c.showProtectedMarks());

    }

}