/**
 * * An Interface that contains exactly one abstract method is known as
 * functional interface.
 * *
 */

@FunctionalInterface
interface A {
    void show();
}

// defining the interface method using class
// class B implements A {
// public void show() {
// System.out.println("in show From B");
// }
// }

public class FunctionalInterface {

    public static void main(String[] args) {
        // Using Anonymous inner class
        A a = new A() {
            public void show() {
                System.out.println(
                        "in show");
            }
        };
        a.show();
    }
}
