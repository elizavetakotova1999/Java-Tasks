package JavaRush;

import java.util.Scanner;

public class ThreeNum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        if (a == b) {
            if (c != a) {
                System.out.println(3);
            }
        } else if (b == c) {
            System.out.println(1);
        } else if (c == a) {
            System.out.println(2);
        }
    }
}