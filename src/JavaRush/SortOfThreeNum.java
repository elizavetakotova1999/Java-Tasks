package JavaRush;

import java.util.Arrays;
import java.util.Scanner;
/*
Сортировка трех чисел
*/

public class SortOfThreeNum {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int array[] = new int[3];
        for (int i = 0; i < array.length; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println(array[i]);
        }
    }
}
