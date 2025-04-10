package core;

// Java Program to find the next greater number same set of
// digits

import java.util.*;

public class FindNextGreaterWithSameDigits {

    // Function to find the next permutation of a given
    // string
    static String nextPermutation(String N)
    {
        // If number of digits is 1 then just return "Not
        // Possible"
        if (N.length() == 1) {
            return "Not Possible";
        }

        // Start from the right most digit and find the
        // first digit that is smaller than the digit next
        // to it.
        int i;
        for (i = N.length() - 1; i > 0; i--) {
            if (N.charAt(i) > N.charAt(i - 1)) {
                break;
            }
        }

        // If i is 0 that means elements are in decreasing
        // order. Therefore, no greater element possible.
        if (i == 0) {
            return "Not Possible";
        }

        // Find the smallest digit on right side of (i-1)'th
        // digit that is greater than N.charAt(i-1)
        for (int j = N.length() - 1; j >= i; j--) {
            if (N.charAt(i - 1) < N.charAt(j)) {
                // Swap the found smallest digit i.e.
                // N.charAt(j) with N.charAt(i-1)
                char[] charArray = N.toCharArray();
                char temp = charArray[i - 1];
                charArray[i - 1] = charArray[j];
                charArray[j] = temp;
                N = new String(charArray);
                break;
            }
        }

        // Reverse the digits after (i-1) because the digits
        // after (i-1) are in decreasing order and thus we
        // will get the smallest element possible from these
        // digits
        char[] charArray = N.toCharArray();
        reverse(charArray, i, N.length() - 1);
        return new String(charArray);
    }

    // Utility function to reverse a portion of a character
    // array
    static void reverse(char[] arr, int start, int end)
    {
        while (start < end) {
            char temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    // Main method to test the function
    public static void main(String[] args)
    {
        // Sample Input
        String N = "218765";

        // Function Call
        System.out.println(nextPermutation(N));
    }
}