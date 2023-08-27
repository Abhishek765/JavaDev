class Calculator {
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int add(int num1, int num2, int num3) {
        return num1 + num2 + num3;
    }

    public double add(double num1, int num2) {
        return num1 + num2;
    }
}

public class MethodOverloading {

    public static void main(String[] args) {
        int num1 = 2;
        int num2 = 3;
        double num3 = 2.3;

        Calculator calculator = new Calculator();

        int addTwoIntResult = calculator.add(num1, num2);
        int addThreeIntResult = calculator.add(num1, num2, num2);
        double addDoubleIntResult = calculator.add(num3, num1);

        System.out.println(addTwoIntResult);
        System.out.println(addThreeIntResult);
        System.out.println(addDoubleIntResult);
    }

}
