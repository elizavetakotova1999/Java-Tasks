package JavaRush;

/*
Произведение 10 чисел
Вывести на экран произведение 10 чисел от 1 до 10.
Результат - это 1 число.

Подсказка:
будет три миллиона с хвостиком.


Требования:
1. Программа должна выводить целое число на экран.
2. Метод main должен вызывать функцию System.out.println.
3. Выведенное число должно быть больше трех миллионов.
4. Выведенное число должно соответствовать заданию.
*/

public class FactorialTenNumbers {
    public static void main(String[] args) {

        class Factorial {
            // рекурсивный метод
            int fact(int n) {
                int result;
                if (n == 1)
                    return 1;
                result = fact(n - 1) * n;
                return result;
            }
        }
        Factorial f = new Factorial();
        System.out.println(f.fact(10));
    }
}