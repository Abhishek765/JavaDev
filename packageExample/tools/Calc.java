package packageExample.tools;

public class Calc {

    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int sub(int num1, int num2) {
        return num1 > num2 ? num1 - num2 : num2 - num1;
    }
}
