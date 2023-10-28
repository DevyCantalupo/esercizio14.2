public class esercizio14di2 {
    public static void invertir(int[][] matrizOriginal, int[][] matrizInvertida, int filas, int columnas) {
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                matrizInvertida[j][i] = matrizOriginal[i][j];
            }
        }

        for (int i = 0; i < columnas; i++) {
            for (int j = 0; j < filas; j++) {
                System.out.print(matrizInvertida[i][j] + " ");
            }
            System.out.println(" ");
        }
    }

    public static void main(String args[]) {
        int[][] array = {{1,2,3}, {4,5,6}};

        int row = array.length;

        int col = array[0].length;

        int[][] array2 = new int[col][row];

        invertir(array, array2, row, col);
    }
}

