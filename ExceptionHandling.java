public class ExceptionHandling {
    public static void main(String[] args) {

        int i = 9;
        int j = 0;
        int a[] = new int[5];
        String s = null;

        try {

            j = 18 / i;
            System.out.println(a[2]);
            System.out.println(s.length());

        } catch (ArithmeticException e) {

            System.out.println("Can't divided by zero");

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index out of bounds");

        } catch (Exception e) {

            System.out.println(e);
        }
        System.out.println(j);
        System.out.println("Bye");
    }
}
