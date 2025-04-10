package core;

public class KthInterestingNumber {

    // Helper to check if number is interesting
    public static boolean isInteresting(int num) {
        String s = String.valueOf(num);
        for (int i = 0; i < s.length(); i++) {
            int digit = s.charAt(i) - '0';
            int position = i + 1; // 1-based indexing
            if (position % 2 == 1) { // odd position: should be even digit
                if (digit % 2 != 0) return false;
            } else { // even position: should be odd digit
                if (digit % 2 != 1) return false;
            }
        }
        return true;
    }

    public static int findKthInteresting(int k) {
        int count = 0;
        int num = 1;
        while (true) {
            if (isInteresting(num)) {
                count++;
                if (count == k) {
                    return num;
                }
            }
            num++;
        }
    }

    public static void main(String[] args) {
        int k = 10; // Change this to any value of K
        int result = findKthInteresting(k);
        System.out.println("The " + k + "th interesting number is: " + result);
    }
}
