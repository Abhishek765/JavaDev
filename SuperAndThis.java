
class A { // here A or all normal classes (no manual inheritance) are inheriting Object
          // class

    public A() {
        super(); // no need to write this super() method
        System.out.println("in A default constructor");
    }

    public A(int num) {

        System.out.println("in A int");
    }

}

/**
 * This is multi-level inheritance -> not multiple inheritance (B is not
 * extending Object class)
 */
class B extends A {

    public B() {
        super(5); // this will call the corresponding parameterized constructor from A
        System.out.println("in B default constructor");
    }

    public B(int num) {
        /**
         * it will call the constructor of same class (in this case class B default
         * constructor)
         */
        this();
        System.out.println("in B int");
    }

}

public class SuperAndThis {

    public static void main(String[] args) {
        // B b = new B();
        B b = new B(5);
    }

}
