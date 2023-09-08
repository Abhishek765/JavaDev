
class Mobile {

    String brand;
    static String name; // by making it static we make it common to all objects for Mobile class
    int price;

    public void show() {
        System.out.println(brand + " : " + name + " : " + price);
    }

    public static void showDetailsStaticDirect() {
        // We can only access static variables inside the static methods -> directly

        System.out.println(name);
    }

    public static void showDetailsStaticIndirectDirect(Mobile obj) {
        // accessing the instance variables insider static method by using object

        System.out.println(obj.brand + " : " + name + " : " + obj.price);
    }

}

public class StaticMethods {

    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Android";
        Mobile.name = "Smartphone";
        obj1.price = 15_000;

        Mobile obj2 = new Mobile();
        obj2.brand = "Apple";
        Mobile.name = "Smartphone";
        obj2.price = 15_000_00;

        obj1.show();
        obj2.show();

        Mobile.showDetailsStaticDirect();
        Mobile.showDetailsStaticIndirectDirect(obj1);
    }

}
