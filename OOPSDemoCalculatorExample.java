
class Calculator {
    int num1, num2;

    Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int sum() {
        return this.num1 + this.num2;
    }

    public int subtraction() {
        return this.num1 > this.num2 ? this.num1 - this.num2 : this.num2 - this.num1;
    }

    public int multiplication() {
        return this.num1 * this.num2;
    }

    public int division() {
        return this.num1 > this.num2 ? this.num1 / this.num2 : this.num2 / this.num1;
    }
}

public class OOPSDemoCalculatorExample {

    public static void main(String[] args) {

        int num1 = 4;
        int num2 = 5;
        Calculator calcObj = new Calculator(num1, num2);
        int sum = calcObj.sum();
        int subtraction = calcObj.subtraction();
        int multiplication = calcObj.multiplication();
        int division = calcObj.division();

        System.out.println("sum: " + sum);
        System.out.println("subtraction: " + subtraction);
        System.out.println("multiplication: " + multiplication);
        System.out.println("division: " + division);
    }

}
