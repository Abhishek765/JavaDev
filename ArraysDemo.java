public class ArraysDemo {

    public static void main(String[] args) {
        /* 1-D array */
        System.out.println("----------1-D array --------");
        int nums[] = { 1, 2, 3, 4, 5, 6 }; // array intialization while declaration step

        int nums1[] = new int[4];

        for (int i = 0; i < nums1.length; i++) {
            nums1[i] = i + 1;
        }

        for (int value : nums1) {
            System.out.println(value);
        }

        System.out.println("----------2-D array --------");

        /* 2-D array */

        int matrix[][] = new int[3][4];

        int rows = matrix.length;
        int cols = matrix[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = (int) (Math.random() * 10);
            }
        }

        // for (int i = 0; i < rows; i++) {
        // for (int j = 0; j < cols; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }
        for (int m[] : matrix) {
            for (int element : m) {
                System.out.print(element + " ");
            }
            System.out.println();
        }

    }

}
