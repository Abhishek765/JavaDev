
class Laptop {
    String model;
    int price;
    String serialNumber;

    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]";
    }

    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

}

public class ObjectClassExample {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop();
        laptop1.model = "Lenevo IdeaPad";
        laptop1.price = 55_000;

        Laptop laptop2 = new Laptop();
        laptop2.model = "Lenevo IdeaPad";
        laptop2.price = 55_000;

        boolean result = laptop1.equals(laptop2);

        System.out.println(result);

    }

}
