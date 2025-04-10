package core;

public class BeautifulNumber {
    public static void main(String[] args) {
        int[] A = {1, -1, 2, 10};
        int maxSum = Integer.MIN_VALUE;
        int currentSum = 0;
        int start = 0, end = 0, tempStart = 0;

        // Step 1: Kadane’s algorithm to find max sum subarray
        for (int i = 0; i < A.length; i++) {
            currentSum += A[i];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;
                end = i;
            }
            if (currentSum < 0) {
                currentSum = 0;
                tempStart = i + 1;
            }
        }

        // Step 2: Find max product in the subarray
        int mostBeautiful = Integer.MIN_VALUE;
        for (int i = start; i <= end; i++) {
            int product = maxSum * A[i];
            if (product > mostBeautiful) {
                mostBeautiful = product;
            }
        }

        System.out.println("Most Beautiful Number: " + mostBeautiful);
    }
}
