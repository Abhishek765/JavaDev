// Which method to call is decided at runtime -> Dynamic Method Dispatch

class A {
    public void show() {
        System.out.println("In A show ");
    }
}

class B extends A {
    public void show() {
        System.out.println("In B show");
    }
}

class C extends A {
    public void show() {
        System.out.println("In C show ");
    }
}

public class RuntimePolymorphism {

    public static void main(String[] args) {
        A obj = new A();
        obj.show(); // this will call A show

        obj = new B();
        obj.show(); // this will call B show

        obj = new C();
        obj.show(); // this will call C show
    }

}
