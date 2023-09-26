
class Human {
    private int age;
    private String name;

    // default constructor
    public Human() {
        age = 23;
        name = "Abhishek";
    }

    // Parameterized constructor
    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    // Getter and setters
    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
}

public class Constructors {

    public static void main(String[] args) {
        Human obj1 = new Human();
        Human obj2 = new Human(24, "John");
        // Default constructor values will be displayed
        System.out.println("Default constructor values");
        System.out.println("Age: " + obj1.getAge() + " Name: " + obj1.getName());

        // Parameterized constructor values will be displayed
        System.out.println("Parameterized constructor values");
        System.out.println("Age: " + obj2.getAge() + " Name: " + obj2.getName());

    }

}
