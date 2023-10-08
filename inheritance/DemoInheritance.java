package inheritance;

public class DemoInheritance {
    public static void main(String[] args) {

        AdvancedCalc advancedCalcObj = new AdvancedCalc();
        int sum = advancedCalcObj.add(2, 3);
        int sub = advancedCalcObj.sub(5, 3);
        int mul = advancedCalcObj.multiply(5, 3);
        int div = advancedCalcObj.divide(15, 3);
        System.out.println(sum + " " + sub + " " + mul + " " + div);
    }

}
