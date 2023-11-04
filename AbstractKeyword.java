/**
 ** An abstract keyword can only be used with class and method.
 ** If a class is abstract, it cannot be instantiated.
 ** 
 * if a method is abstract, then we have to define the respective class as
 ** abstract
 ** 
 * If a class extends the abstract class, it must also implement all the
 ** abstract methods.
 * 
 * 
 */

abstract class Bike {
    public abstract void drive();

    public abstract void fly();

    public void playMusic() {
    }
}

class Honda extends Bike { // ! Concrete class

    @Override
    public void drive() {
        System.out.println("Honda Bike is driving...");
    }

    @Override
    public void fly() {
        System.out.println("Honda Bike is flying...");
    }

}

public class AbstractKeyword {
    public static void main(String[] args) {

        Bike hondaBike = new Honda(); // ! We can't create objects of abstract classes
        hondaBike.drive();
        hondaBike.fly();
    }
}
