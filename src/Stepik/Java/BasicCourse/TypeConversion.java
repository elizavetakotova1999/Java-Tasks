package Stepik.Java.BasicCourse;

/*Реализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\"
(обратный слэш) на расстоянии a.В качестве примера написано заведомо неправильное выражение.
Исправьте его.*/
public class TypeConversion {
    public static void main(String[] args) {
        System.out.println(charExpression(32));
    }

    public static char charExpression(int steps) {
        return (char) ((int) '\\' + steps);
    }
}
