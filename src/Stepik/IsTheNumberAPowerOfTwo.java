package Stepik;

public class IsTheNumberAPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(0));
    }

    public static boolean isPowerOfTwo(int value) {
        Integer n = Integer.bitCount(value);
//        if(Math.abs(n & (n - 1)) == 0)
//            return true;
//        else
//            return false;

    }
}
