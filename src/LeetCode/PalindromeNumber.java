package LeetCode;

public class PalindromeNumber {
    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        System.out.println(palindromeNumber.isPalindrome(113311));
    }
    public boolean isPalindrome(int x) {
        int remind;
        int result = 0;
        int fake_x = x;
        while(fake_x!=0){
           if (x>0){
            remind = fake_x%10;
            result = result*10+remind;
            fake_x/=10;
           }else{
               return false;
           }
        }
        return x == result;
    }
}
