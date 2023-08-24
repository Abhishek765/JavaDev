public class Loops {

    public static void main(String[] args) {
        // loop -> for, while, do-while

        for (int i = 0; i < 4; i++) {
            System.out.println("Hi from for loop");
        }

        int num[] = { 1, 2, 3, 4, 5, 6 };

        for (int i : num) {
            System.out.println("Go to " + i);
        }

        int i = 0;
        while (i < 4) {
            System.out.println("Hi from while loop");
            i++;
        }

        int j = 0;
        do {
            System.out.println("Hi from do while loop");
            j++;
        } while (j != 4);

        // A star simple pattern example
        for (int it = 4; it >= 0; it--) {

            for (int jt = it; jt >= 0; jt--) {
                System.out.print("*");

            }
            System.out.println();

        }
    }

}
