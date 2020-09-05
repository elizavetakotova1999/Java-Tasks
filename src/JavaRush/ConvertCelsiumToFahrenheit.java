package JavaRush;

/* Метод convertCelsiumToFahrenheit(int celsium) принимает значение в градусах Цельсия. Метод должен переводить
   температуру и возвращать значение в градусах Фаренгейта.
   Температура по Цельсию TC и температура по Фаренгейту TF связаны следующим соотношением:
   TC = (TF – 32) * 5/9.
   Пример:
   В метод convertCelsiumToFahrenheit на вход подается значение 41.
   Пример вывода:
   105.8
   */

public class ConvertCelsiumToFahrenheit {
    public static void main(String[] args) {
        System.out.println(convert(41));
    }

    public static double convert(int celsium) {

        double fahrenheit = 9 / 5.0 * celsium + 32;

        return fahrenheit;
    }
}