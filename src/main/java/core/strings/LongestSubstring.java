package core.strings;


import java.util.HashSet;

public class LongestSubstring {
    public static void main(String[] args) {
        String str = "pkwwew";
        findLongestSubString(str);
    }

    public static void findLongestSubString(String str) {
        int n = str.length();
        int maxLength = 0;
        int left = 0;

        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < n; right++) {
            while (set.contains(str.charAt(right))) {
                set.remove(str.charAt(left));
                left++;
            }

            set.add(str.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        System.out.println("Longest Sub String length is: " + maxLength);
    }
}
