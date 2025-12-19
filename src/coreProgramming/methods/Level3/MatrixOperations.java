package coreProgramming.methods.Level3;

// Program to perform matrix operations
class MatrixOperations {

    // Create random matrix
    public static double[][] generateMatrix(int r, int c) {
        double[][] m = new double[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                m[i][j] = (int) (Math.random() * 10);
        return m;
    }

    // Display matrix
    public static void display(double[][] m) {
        for (double[] row : m) {
            for (double v : row) {
                System.out.print(v + "\t");
            }
            System.out.println();
        }
    }

    // Add matrices
    public static double[][] add(double[][] a, double[][] b) {
        double[][] r = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                r[i][j] = a[i][j] + b[i][j];
        return r;
    }

    // Subtract matrices
    public static double[][] subtract(double[][] a, double[][] b) {
        double[][] r = new double[a.length][a[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < a[0].length; j++)
                r[i][j] = a[i][j] - b[i][j];
        return r;
    }

    // Multiply matrices
    public static double[][] multiply(double[][] a, double[][] b) {
        double[][] r = new double[a.length][b[0].length];
        for (int i = 0; i < a.length; i++)
            for (int j = 0; j < b[0].length; j++)
                for (int k = 0; k < b.length; k++)
                    r[i][j] += a[i][k] * b[k][j];
        return r;
    }

    // Transpose
    public static double[][] transpose(double[][] m) {
        double[][] t = new double[m[0].length][m.length];
        for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                t[j][i] = m[i][j];
        return t;
    }

    public static void main(String[] args) {

        double[][] A = generateMatrix(2, 2);
        double[][] B = generateMatrix(2, 2);

        System.out.println("Matrix A:");
        display(A);

        System.out.println("\nMatrix B:");
        display(B);

        System.out.println("\nAddition:");
        display(add(A, B));

        System.out.println("\nSubtraction:");
        display(subtract(A, B));

        System.out.println("\nMultiplication:");
        display(multiply(A, B));

        System.out.println("\nTranspose of A:");
        display(transpose(A));
    }
}
