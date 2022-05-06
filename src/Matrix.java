public class Matrix<T extends Number> {
    public T[][] arr;

    public Matrix(T[][] arr) {
        this.arr = arr;
    }


    public void plusMatrix(T[][] arr, T[][] arr1) {
        T[][] arr2 = new T[arr.length][arr1[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr2[i][j] = arr[i][j] + arr1[i][j];
            }

        }

    }

    public void multiMatrix(T[][] arr, T[][] arr1) {
        T[][] arr2 = new T[arr.length][arr1[0].length];

        for (int i = 0; i < arr.length; i++) { //умножаю массив на массив
            for (int j = 0; j < arr1[0].length; j++) {
                for (int k = 0; k < arr1.length; k++) {
                    arr2[i][j] = arr2[i][j] + arr[i][k] * arr1[k][j];
                }

            }

        }
    }

}
