package MyTasks.MatrixTask;

public class Matrix {
    private final int[][] a;

    public Matrix(int n, int m) {
    // создание и заполнение нулевыми значениями
        a = new int[n][m];
    }

    public int getVerticalSize() {
        return a.length;
    }

    public int getHorizontalSize() {
        return a[0].length;
    }

    public int getElement(int i, int j) {
        return a[i][j];
    }

    public void setElement(int i, int j, int value) {
        a[i][j] = value;
    }

    public String toString() {
        String s = "\nMatrix : " + a.length +
                "x" + a[0].length + "\n";
        for (int[] vector : a) {
            for (int value : vector)
                s += value + " ";
            s += "\n";
        }
        return s;
    }
}
