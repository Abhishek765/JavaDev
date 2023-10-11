package packageExample;

// import packageExample.tools.*;
import packageExample.tools.ScientificCalc;
// import packageExample.tools.Calc;

public class Demo {
    public static void main(String[] args) {
        // Calc calc = new Calc();
        ScientificCalc scientificCalc = new ScientificCalc();
        scientificCalc.add(2, 2);
        scientificCalc.PI();

    }
}
