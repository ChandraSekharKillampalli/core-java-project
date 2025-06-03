package core.strings;

public class PalindromeCheck {
    public static void main(String[] args){
        isPalindrome(121);
    }
    private static Boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        int originalNum = x;
        int reversedNum = 0;
        while (x > 0){
            int remainder = originalNum % 10;
            reversedNum = reversedNum * 10 + remainder;
            x = x/10;
        }
        return originalNum == reversedNum;
    }
}
