/**
 ** Useful when we want to implement the methods of class, abstract methods or
 ** interfaces only once
 */
// ! Normal class example
// class A {
// public void show() {
// System.out.println("show in A");
// }
// }

// ! Abstract method example
abstract class B {

    public abstract void show();

    public abstract void config();
}

public class AnonymousInnerClassExample {
    public static void main(String[] args) {

        // ! NOTE: we're not creating object of B (i.e. abstract class) which is not
        // ! possible instead we're creating object of anonymous inner class
        B obj = new B() {
            public void show() {
                System.out.println("in new Anonymous inner class Show"); /*
                                                                          * ! This concept is very important and useful
                                                                          * for interfaces, functional interfaces,
                                                                          * and lambda expressions
                                                                          */
            }

            public void config() {
                System.out.println("in new Anonymous inner class config");
            }
        };

        obj.show(); // ! this will execute code of Anonymous inner class show()

        // ! New inner class of B
        B obj1 = new B() {
            public void show() {
                System.out.println("New Object of anonymous inner class");
            }

            public void config() {
                System.out.println("New Object of anonymous inner config");
            }
        };

        obj1.show();

    }

}
