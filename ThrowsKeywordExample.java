/**
 ** `throws` keyword is helpful for ducking the exceptions -> if there an
 ** critical statement present in a method which can cause an exception to be
 ** thrown then that method can use the `throws` keyword to indicate that, so the
 ** method which is calling that critical statement method has to handle the
 ** exception
 */

class A {
    public void show() throws ClassNotFoundException {
        // Class.forName("ThrowsKeywordExample"); //! this will be pass
        Class.forName("Demo"); // ! this will only pass if the class mentioned is present -> here it will throw
                               // ! an exception
    }
}

public class ThrowsKeywordExample {

    static {
        System.out.println("Class Loaded"); // ! this will be called every time as ThrowsKeywordExample is defined
    }

    public static void main(String[] args) {
        A a = new A();

        // ! since inside main method we're calling the show method which can throw an
        // ! exception so we need to handle that
        try {
            a.show();
            System.out.println("success");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
