package LeetCode;

public class ReverseIntegerThreeNums {
    public static void main(String[] args) {
        ReverseIntegerThreeNums reverseInteger = new ReverseIntegerThreeNums();
        System.out.println(reverseInteger.reverse(-564));
    }
    public int reverse(int x) {
        int a = Math.abs(x / 100);//1
        int b = Math.abs(x / 10 % 10);//2
        int c = Math.abs(x % 10);//3
        if(x<0) {
             String s = "-"+c+""+b+""+a;
             return Integer.parseInt(s);
        }else {
            String s = c+""+b+""+a;
            return Integer.parseInt(s);
        }

    }
}

