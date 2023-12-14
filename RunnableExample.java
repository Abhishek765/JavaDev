
class A implements Runnable {
    @Override
    public void run() {
        System.out.println("hi");
    }
}

class B implements Runnable {
    @Override
    public void run() {
        System.out.println("hello");
    }
}

public class RunnableExample {

    public static void main(String[] args) {

        Runnable obj2 = new Runnable() {
            public void run() {
                System.out.println("hello");
            }
        };

        // Using lambda
        Runnable obj1 = () -> {
            for (int i = 0; i < 100; i++) {
                System.out.println("Hello");
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();
    }

}
