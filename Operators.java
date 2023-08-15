public class Operators {
    public static void main(String args[]) {

        int num1 = 2;
        int num2 = 3;

        // ! Arithmetic Operators
        int sum = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        int modulo = num1 % num2;

        System.out.println("sum: " + sum + " sub: " + sub + " mul: " + mul + " div: " + div + " modulo: " + modulo);

        // num1 += 1; // Increment by value
        // num1++; // post increment
        // num1--; // post decrement
        // ++num1 // pre increment
        // --num1 // pre decrement

        // ! Relational Operators
        // boolean result = num1 < num2;
        // boolean result = num1 > num2;
        int x = 6, y = 6;
        // boolean result = x >= y;
        // boolean result = x <= y;
        // boolean result = x != y;
        // boolean result = x == y;

        // ! Logical operators -> &&, ||, !
        // boolean result = x <= y && num1 > num2;
        // boolean result = x <= y || num1 > num2;
        boolean result = !(x <= y || num1 > num2);

        System.out.println(result);
    }
}
