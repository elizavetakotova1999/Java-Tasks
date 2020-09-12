package JavaRush;


/*
День недели
*/

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();
        String text;
        switch (day) {
            case 1:
                text = "понедельник";
                break;
            case 2:
                text = "вторник";
                break;
            case 3:
                text = "среда";
                break;
            case 4:
                text = "четверг";
                break;
            case 5:
                text = "пятница";
                break;
            case 6:
                text = "суббота";
                break;
            case 7:
                text = "воскресенье";
                break;
            default:
                text = "такого дня недели не существует";
                break;
        }
        System.out.println(text);

    }
}