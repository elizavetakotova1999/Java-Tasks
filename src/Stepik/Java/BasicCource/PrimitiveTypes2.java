package Stepik.Java.BasicCource;

/*Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
Допустимая погрешность = 0.0001 (1E-4)(погрешность не может быть отрицательной)
*/

public class PrimitiveTypes2 {
    public static void main(String[] args) {
        System.out.println(doubleExpression(0.3, 0.5, 0.8));
    }

    public static boolean doubleExpression(double a, double b, double c) {
        return Math.abs(a + b - c) < 0.0001;
    }
}
