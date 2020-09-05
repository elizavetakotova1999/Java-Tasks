package Stepik;

/*Реализуйте метод, возвращающий true, если среди четырех его аргументов ровно два истинны (любые).
Во всех остальных случаях метод должен возвращать false.*/

import java.util.Scanner;

public class PrimitiveTypes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        boolean c = sc.nextBoolean();
        boolean d = sc.nextBoolean();
        System.out.println(booleanExpression(a, b, c, d));
    }

    public static boolean booleanExpression(boolean a, boolean b, boolean c, boolean d) {
        return (!a & !b & c & d) ^ (a & b & !c & !d) ^ (!a & b & !c & d) ^ (a & !b & c & !d) ^ (!a & b & c & !d) ^ (a & !b & !c & d);
    }
}
