package Stepik;

//Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.

/*Решение задачи:
Метод Integer.bitCount подчитывает количество единиц в двоичном представлении числа, например 2^2(4) = 10, 2^3(8) = 100 и т.д,
а число 3 = 011, то есть если результат равняется единице, тогда число является степенью двойки. Абсолютна величина или же
модуль числа для отрицательных чисел реализована с помощью Math.abs.
 */
public class IsTheNumberAPowerOfTwo {
    public static void main(String[] args) {
        System.out.println(isPowerOfTwo(1));
    }

    public static boolean isPowerOfTwo(int value) {
        int n = Integer.bitCount(Math.abs(value));
        return (n == 1);
    }
}
