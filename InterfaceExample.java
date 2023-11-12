/**
 * * In Interface by default all methods are `public abstract`
 * * We can't create objects of interface
 * * all variables are by default final and static
 * 
 */

interface A {
    // ! all variables are by default final and static
    String area = "Bangalore";
    int age = 24;

    void show();

    void config();
}

class B implements A {

    public void show() {
        System.out.println("In show B");
    }

    public void config() {
        System.out.println("In config B");
    }

}

public class InterfaceExample {

    public static void main(String[] args) {
        A obj;
        obj = new B();

        obj.show();
        obj.config();

        // A.age = 24 //! this is not possible because age is final
        System.out.println("A.age = " + A.age);
    }

}
