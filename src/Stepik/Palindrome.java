package Stepik;
/*Реализуйте метод, проверяющий, является ли заданная строка палиндромом.
Палиндромом называется строка, которая читается одинаково слева направо и справа налево (в том числе пустая).
При определении "палиндромности" строки должны учитываться только буквы и цифры. А пробелы, знаки препинания,
а также регистр символов должны игнорироваться. Гарантируется, что в метод попадают только строки, состоящие
из символов ASCII (цифры, латинские буквы, знаки препинания).
Т.е. русских, китайских и прочих экзотических символов в строке не будет.*/


public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome("П;а ап"));
    }

    public static boolean isPalindrome(String text) {
        text = text.toLowerCase().replaceAll("(?U)[\\pP\\s]", "");
        StringBuffer palindrome = new StringBuffer(text).reverse();
        String reverse_text = palindrome.toString();
        //System.out.println(palindrome);
        return reverse_text.equals(text);

    }
}
