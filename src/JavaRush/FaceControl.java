package JavaRush;

import java.util.Scanner;
/*
Фейс-контроль
Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись «И 18-ти достаточно».

Требования:
1.	Программа должна считывать строки c клавиатуры.
2.	Программа должна использовать команду System.out.println() или System.out.print().
3.	Если возраст больше 20 вывести только сообщение &quot;И 18-ти достаточно&quot;.
4.	Если возраст меньше либо равно 20 ничего не выводить.
*/

public class FaceControl {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int age = sc.nextInt();
        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }

    }
}
