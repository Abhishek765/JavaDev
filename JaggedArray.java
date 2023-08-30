public class JaggedArray {

    public static void main(String[] args) {

        int jaggedArray[][] = new int[4][]; // we can define the size of columns later

        jaggedArray[0] = new int[2];
        jaggedArray[1] = new int[4];
        jaggedArray[2] = new int[3];
        jaggedArray[3] = new int[1];

        for (int i = 0; i < jaggedArray.length; i++) {

            for (int j = 0; j < jaggedArray[i].length; j++) {
                jaggedArray[i][j] = (int) (Math.random() * 10);
            }

        }

        for (int m[] : jaggedArray) {

            for (int n : m) {
                System.out.print(n + " ");
            }
            System.out.println();
        }

        int multiDimensionalArr[][][] = new int[4][2][3]; // 3-D array

    }

}
