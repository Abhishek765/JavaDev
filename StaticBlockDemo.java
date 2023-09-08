
class Mobile {
    int price;
    static String name;
    String brand;

    static {
        name = "Smart Phone";
        System.out.println("Static Block will be called only once -> when the Class is loaded");
    }

    Mobile() {
        price = 123;
        brand = "Apple";
        System.out.println("this will be called for every object creation");
    }
}

public class StaticBlockDemo {
    public static void main(String[] args) throws ClassNotFoundException {

        // Mobile moObj = new Mobile();
        // Mobile moObj1 = new Mobile();
        // Mobile moObj2 = new Mobile();

        Class.forName("Mobile"); // To load the a class without object creation
    }

}
