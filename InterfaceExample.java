/**
 * * In Interface by default all methods are `public abstract`
 * * We can't create objects of interface
 * * all variables are by default final and static
 * * class - class = extends
 * * class - interface = implements
 * * interface - interface = extends
 */

interface A {
    // ! all variables are by default final and static
    String area = "Bangalore";
    int age = 24;

    void show();

    void config();
}

interface X {
    void run(); // ! by default methods in interface are public abstract
}

interface Y extends X {
}

class B implements A, Y {

    public void show() {
        System.out.println("In show B");
    }

    public void config() {
        System.out.println("In config B");
    }

    public void run() {
        System.out.println("In run B");
    }

}

public class InterfaceExample {

    public static void main(String[] args) {
        A obj;
        obj = new B();

        obj.show();
        obj.config();

        X obj1 = new B();
        obj1.run();

        // A.age = 24 //! this is not possible because age is final
        System.out.println("A.age = " + A.age);
    }

}
