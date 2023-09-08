
class Mobile {

    String brand;
    static String name; // by making it static we make it common to all objects for Mobile class
    int price;

    public void show() {
        System.out.println(brand + " : " + name + " : " + price);
    }

}

public class StaticDemo {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Android";
        Mobile.name = "Smartphone"; // common name -> can be static
        obj1.price = 15_000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        Mobile.name = "Smartphone"; // common name -> can be static
        obj2.price = 15_000_00;

        obj1.show();
        obj2.show();

    }

}
