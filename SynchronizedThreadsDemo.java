class Counter {
    int count;

    /**
     ** If we declare any method as synchronized, it is known as synchronized
     ** method.
     * 
     * * Synchronized method is used to lock an object for any shared resource.
     * 
     * * When a thread invokes a synchronized method, it automatically acquires the
     * * lock for that object and releases it when the thread completes its task.
     * 
     * 
     */
    public synchronized void increment() {
        count++;
    }
}

public class SynchronizedThreadsDemo {
    public static void main(String[] args) {

        Counter counterObj = new Counter();

        Runnable obj1 = () -> {
            for (int i = 0; i < 1000; i++) {
                counterObj.increment();
            }
        };

        Runnable obj2 = () -> {
            for (int i = 0; i < 1000; i++) {
                counterObj.increment();
            }
        };

        Thread t1 = new Thread(obj1);
        Thread t2 = new Thread(obj2);

        t1.start();
        t2.start();

        try {
            /**
             * * When the join() method is invoked, the current thread stops its execution
             * * and the thread goes into the wait state.
             * * The current thread remains in the wait state until the thread on which the
             * * join() method is invoked called is dead or the wait for the specified time
             * * frame(in milliseconds) is over.
             */
            t1.join(); // ! making sure t1 thread is waiting
            t2.join(); // ! making sure t2 thread is waiting
        } catch (Exception e) {
            System.out.println("Exception Occurred: " + e.getMessage());

        }
        System.out.println(counterObj.count);
    }

}
