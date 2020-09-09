package JavaRush;

/*
Конвертируем время
*/

public class ConvertingTime {
    public static int convertToSeconds(int hour) {
        return hour * 3600;
    }

    public static void main(String[] args) {
        System.out.println(convertToSeconds(1));
        System.out.println(convertToSeconds(3));

    }
}