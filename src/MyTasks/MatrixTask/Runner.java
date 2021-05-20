package MyTasks.MatrixTask;

public class Runner {
    public static void main(String[] args) {
        int n = 2, m = 3, l = 4;
        Matrix p = MatrixFactory.createRandomized(n, m);
        Matrix q = MatrixFactory.createRandomized(m, l);
        System.out.println("Matrix first is: " + p);
        System.out.println("Matrix second is: " + q);
        try {
            Matrix result = Multiplicator.multiply(p, q);
            System.out.println("Matrix product is: "
                    + result);
        } catch (MultipleException e) {
            System.err.println("Matrices could"
                    + " not be multiplied: ");
        }
    }
}
