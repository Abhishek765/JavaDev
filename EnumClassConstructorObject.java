/**
 ** Enum can be utilized as class -> but we can't inherit this enum class
 */

enum Laptop {
    Macbook(2000), Hp(1800), Surface, XPS(2100);

    private int price;

    private Laptop() {
        this.price = 500;
        System.out.println("this will only be called for default values case for example: surface");
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("this will only be called for passed price value case for example: Macbook, Hp, XPS");
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}

public class EnumClassConstructorObject {

    public static void main(String[] args) {
        // Laptop lap = Laptop.Macbook;
        // System.out.println(lap + " : price->" + lap.getPrice());

        for (Laptop lap : Laptop.values()) {
            System.out.println(lap + " : price->" + lap.getPrice());
        }

    }

}
