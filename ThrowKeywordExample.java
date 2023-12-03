public class ThrowKeywordExample {
    public static void main(String[] args) {

        int i = 20;
        int j = 0;

        try {

            j = 18 / i;
            if (j == 0) {
                throw new ArithmeticException("Message from throw"); // ! Don't want zero value so throw an
                                                                     // ! ArithmeticException
            }

        } catch (ArithmeticException e) {

            System.out.println("Invalid operation check your arithmetic operation adding default value" + e);
            j = 18 / 1;
        } catch (Exception e) {

            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
