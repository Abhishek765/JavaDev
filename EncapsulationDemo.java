// Binding data (instance variables) with methods is encapsulation

class Human {
    // Private members only accessible inside this class only
    private int age = 12;
    private String name = "Abhishek";

    // Setters
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {

        Human humanObj = new Human();

        System.out.println("age: " + humanObj.getAge() + " name: " + humanObj.getName());

        humanObj.setAge(23);
        humanObj.setName("Abhishek Vishwakarma");

        System.out.println("age: " + humanObj.getAge() + " name: " + humanObj.getName());
    }
}
