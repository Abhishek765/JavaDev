
class Calc {
    public int add(int n1, int n2) {
        return n1 + n2;
    }
}

class AdvCalc extends Calc {

    public int add(int n1, int n2) { // Overriding the method in child class
        return n1 + n2 + 1;
    }
}

public class MethodOverriding {

    public static void main(String[] args) {
        AdvCalc advCalc = new AdvCalc();
        int res = advCalc.add(3, 3);
        System.out.println(res);
    }

}
