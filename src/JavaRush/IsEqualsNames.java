package JavaRush;

import java.util.Scanner;

public class IsEqualsNames {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Имена идентичны");
        } else if (!name1.equals(name2) && name1.length() == name2.length()) {
            System.out.println("Длины имен равны");
        }

    }
}
