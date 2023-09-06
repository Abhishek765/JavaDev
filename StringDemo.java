public class StringDemo {

    public static void main(String[] args) {
        // String name = new String("Abhishek");
        String name = "Abhishek";

        System.out.println(name.charAt(0)); // b
        System.out.println(name.concat(" Vishwakarma")); // b

        // String immutability
        String name2 = "John"; // let's day it has address = 100
        name2 = name2 + " Smith"; // this will reassign name2 with new address let's say 105

        System.out.println(name2);

        // Different Reference variables with same address in stack point to Car in heap
        // space
        String vehicle1 = "Car";
        String vehicle2 = "Car";

        /* Strings in JAVA are immutable */
    }

}
