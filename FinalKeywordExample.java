// final- can be applied to variables, methods, class

/**
 ** final with variables -> to make variable constant
 ** final with class -> to stop inheritance
 ** final with method -> to stop method override
 */

// ! We can't inherit from final class
// final class Calc {
// public void show() {
// System.out.println("Inside calc show");
// }
// }

class Calc {
    public final void show() {
        System.out.println("Inside calc show");
    }
}

class AdvCalc extends Calc {

    // ! We can't override the method show 
    // public void show() {
    // System.out.println("Inside AdvCalc show");
    // }

    public void displayMessage() {
        System.out.println("Inside AdvCalc display");
    }

}

public class FinalKeywordExample {

    public static void main(String[] args) {
        final int num = 0;
        // num = 1; // This is not possible
        System.out.println(num);
    }

}
