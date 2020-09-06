package Stepik;

import java.math.BigInteger;

/*Реализуйте метод, вычисляющий факториал заданного натурального числа.
Факториал N вычисляется как 1 * 2 * ...* N.
Поскольку это очень быстро растущая функция, то даже для небольших N
вместимости типов int и long очень скоро не хватит. Поэтому будем использовать BigInteger.*/

public class BigIntegerFactorial {
    public static void main(String[] args) {
        System.out.println(factorial(456));
    }

    public static BigInteger factorial(int value) {
        return value <= 0 ? BigInteger.ONE : BigInteger.valueOf(value).multiply(factorial(value - 1));
    }
}
