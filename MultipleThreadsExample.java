/**
 * * Here we're utilizing two threads to execute the task parallelly
 */

class A extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hi");
        }
    }
}

class B extends Thread {
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println("Hello");
        }
    }
}

public class MultipleThreadsExample {
    public static void main(String[] args) {
        A objA = new A();
        B objB = new B();

        objA.start();
        objB.start();

    }

}
