package LeetCode;
/*
    Для 32-битного целого числа x со знаком вернуть x с перевернутыми цифрами.
    Если реверсирование x приводит к тому, что значение выходит за пределы диапазона
    32-битных целых чисел со знаком, возвращается 0.
 */
public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger rev = new ReverseInteger();
        System.out.println(rev.reverse(-526343));
    }
    public int reverse(int x) {
        int result = 0;
        while (x != 0) {
            int remainder = x % 10;
            //Максимальное значение Integer это 2^31-1 = 2147483647
            //Если MAX_VALUE%10>7 произойдет переполнение,максимальное значение остатка от деления может быть только 7.
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE/10 && remainder > 7)) return 0;

            //Минимальное значение Integer is -2^31 = 2147483648
            //Логика аналогична описанной выше, но максимальное значение остатка от деления может быть -8.
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE/10 && remainder < -8)) return 0;
            result = result * 10 + remainder;
            x /= 10;
        }
        return result;
    }
}
