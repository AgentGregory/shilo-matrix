public class Matrix<Integer extends Number> {
    public Matrix<Integer>arr[][];

    public Matrix(Integer[][]arr) {
    }


    public void plusMatrix(int arr[][], int arr1[][]) {
        int[][] arr2 = new int[arr.length][arr1[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr2[i][j] = arr[i][j] + arr1[i][j];
            }

        }

    }

    public void multiMatrix(int arr[][], int arr1[][]) {
        int[][] arr2 = new int[arr.length][arr1[0].length];

        for (int i = 0; i < arr.length; i++) { //умножаю массив на массив
            for (int j = 0; j < arr1[0].length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    arr2[i][j] = arr2[i][j] + arr[i][k] * arr1[k][j];
                }

            }

        }
    }

}
