
class A {
    public void show1() {
        System.out.println("In show1");
    }
}

class B extends A {
    public void show2() {
        System.out.println("In show2");
    }
}

public class UpAndDownCasting {

    public static void main(String[] args) {

        A obj = new B(); // can be written like this also -> A obj = (A) new B(); -> which is UpCasting
        obj.show1();

        B obj1 = (B) obj; // we are typecasting Reference of A (Parent class) to B (Child class) ->
                          // DownCasting
        obj1.show2();
    }
}
