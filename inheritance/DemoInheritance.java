package inheritance;

public class DemoInheritance {
    public static void main(String[] args) {

        ScientificCalc scientificCalcObj = new ScientificCalc();
        int sum = scientificCalcObj.add(2, 3);
        int sub = scientificCalcObj.sub(5, 3);
        int mul = scientificCalcObj.multiply(5, 3);
        int div = scientificCalcObj.divide(15, 3);
        double powerOfTwo = scientificCalcObj.power(2, 3);
        double piValue = scientificCalcObj.PI();
        System.out.println(sum + " " + sub + " " + mul + " " + div + " " + powerOfTwo + " " + piValue);
    }

}
