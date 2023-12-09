import java.util.Scanner;

/**
 ** we can also utilize BufferedReader to take the input
 */

public class ScannerClassExample {
    public static void main(String[] args) {
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(num);

    }

}
