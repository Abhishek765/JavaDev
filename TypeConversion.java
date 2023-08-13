public class TypeConversion {

    public static void main(String[] args) {

        byte b1 = 127;
        byte b2 = 100;
        int num1 = 23, num2 = 257;
        b1 = (byte) num1; // explicit type conversion -> casting

        num1 = b2; // Implicit conversion
        System.out.println(b1);

        b2 = (byte) num2; // output -> (257 % 256) = 1
        System.out.println("b2: " + b2);

        float f1 = 5.6f;
        int num3 = (int) f1; // values after . will be lost
        System.out.println(num3);

        int result = b1 * b2; // type promotion

        System.out.println(result);
    }
}
