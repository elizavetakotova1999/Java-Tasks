package JavaRush;

import java.math.BigInteger;

public class BigIntegerFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(456));
    }
    /**
     * Calculates factorial of given <code>value</code>.
     *
     * @param value positive number
     * @return factorial of <code>value</code>
     */
    public static BigInteger factorial(int value) {
        return value <= 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial(value - 1));

    }
}
