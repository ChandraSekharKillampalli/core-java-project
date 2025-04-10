package core;

import java.util.Arrays;
import java.util.stream.Stream;

public class Problem_16 {
    public static void main(String args[]){
        int[] a = {1,2,3,4,5,6};
        int[] b = {2,3,4,6,8,9};

        mergeBothArrays(a,b);
    }

    private static void mergeBothArrays(int[] a, int[] b) {
        int[] c = new int[a.length + b.length];
        int k = 0, i = 0, j = 0;

        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Traverse arr2 and insert its elements into arr3
        while (j < b.length) {
            c[k++] = b[j++];
        }

        // Sort the entire arr3
        Arrays.sort(c);
        Arrays.stream(c).forEach(System.out:: println);
    }
}
