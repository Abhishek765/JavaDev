
/**
 * * Lamda Expressions only works with Functional interfaces
 * * Its a Syntactic Sugar of Anonymous inner classes
 */
import java.lang.FunctionalInterface;

@FunctionalInterface
interface A {
    void show();
}

@FunctionalInterface
interface B {
    void run(String name);
}

@FunctionalInterface
interface C {
    String run(String str);
}

public class LamdaExpressionExample {
    public static void main(String[] args) {

        A aObj = () -> System.out.println("In show"); // ! normal lambda expression
        B bObj = (name) -> System.out.println("In run with name " + name); // ! lambda expression with parameter
        C cObj = (str) -> str;

        aObj.show();
        bObj.run("Abhishek");

        String sentence = cObj.run("Abhishek With Return lambda function"); // ! Lambda expression with return example
        System.out.println(sentence);

    }
}
