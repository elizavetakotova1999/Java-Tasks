package Stepik;

public class IsTheNumberAPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int value) {
        int n = Integer.bitCount(Math.abs(value));
        return (n == 1);
    }
}
