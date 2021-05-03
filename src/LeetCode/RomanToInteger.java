package LeetCode;

import java.util.Arrays;

public class RomanToInteger {
    public static void main(String[] args) {
        RomanToInteger roman = new RomanToInteger();
        System.out.println(roman.romanToInt("MCMXCIV"));//1994
    }
        //I             1
        //V             5
        //X             10
        //L             50
        //C             100
        //D             500
        //M             1000
   /* Римские цифры обычно пишутся от наибольшего к наименьшему слева направо. Однако цифра четыре - это не IIII. Вместо этого число четыре записывается как IV. Поскольку единица стоит перед пятью, мы вычитаем ее и получаем четыре. Тот же принцип применяется к числу девять, которое записывается как IX. Вычитание используется в шести случаях:
        I можно поставить перед V (5) и X (10), чтобы получилось 4 и 9.
        X можно поставить перед L (50) и C (100), чтобы получилось 40 и 90.
        C можно поставить перед D (500) и M (1000), чтобы получилось 400 и 900.
        Если дана римская цифра, преобразуйте ее в целое число.*/

    public int romanToInt(String s) {
        int array[] = new int[s.length()];
        int number = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='I') array[i] = 1;
            else if (s.charAt(i)=='V') array[i] = 5;
            else if (s.charAt(i)=='X') array[i] = 10;
            else if (s.charAt(i)=='L') array[i] = 50;
            else if (s.charAt(i)=='C') array[i] = 100;
            else if (s.charAt(i)=='D') array[i] = 500;
            else if (s.charAt(i)=='M') array[i] = 1000;
        }

        for (int i = 0; i < s.length()-1; i++) {
            if (array[i+1]>array[i]){
                array[i] = array[i+1]-array[i];
                array[i+1] = 0;
                i++;
            }
        }
        for (int i = 0; i < s.length(); i++) {
            number += array[i];
        }
    return number;
    }

}
