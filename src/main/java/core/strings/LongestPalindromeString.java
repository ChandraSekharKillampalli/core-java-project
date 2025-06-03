package core.strings;

public class LongestPalindromeString {
    public static String longestPalindrome(String s) {
        int n = s.length();
        if(n == 0 || s == null) return "";
        int start = 0; int end = 0;
        for(int i = 0; i < n; i++){
            int len1 = findFrom(s, i, i);
            int len2 = findFrom(s, i, i+1);
            int len = Math.max(len1, len2);
            if (len > end - start) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }
        }
        return s.substring(start, end + 1);
    }
    private static int findFrom(String str, int left, int right){
        while(left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)){
            left--;
            right++;
        }
        return right-left-1;
    }
    public static void main(String[] args){
        System.out.print(longestPalindrome("racecar"));
    }
}
