
/**
 * * To create a custom Exception
 */
class MyCustomArithmeticException extends Exception {
    public MyCustomArithmeticException(String message) {
        super(message); // ! calling Parent class (Exception class) Parametrized constructor
    }
}

public class MyCustomException {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {

            j = 18 / i;
            if (j == 0) {
                throw new MyCustomArithmeticException("Message from throw"); // ! Don't want zero value so throw a
                                                                             // ! custom
                                                                             // ! exception
            }

        } catch (ArithmeticException e) {

            System.out.println("Invalid operation check your arithmetic operation adding default value" + e);
            j = 18 / 1;
        } catch (MyCustomArithmeticException e) {
            System.out.println("Inside Custom Exception: Something went wrong" + e);
        }

        catch (Exception e) {

            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
