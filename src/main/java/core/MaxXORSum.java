package core;

public class MaxXORSum {
    public static void main(String[] args) {
        int[] A = {10, 5, 1};
        int[] B = new int[A.length];
        int maxXORSum = 0;

        for (int i = 0; i < A.length; i++) {
            B[i] = Integer.MAX_VALUE; // Choosing value to maximize XOR
            maxXORSum += A[i] ^ B[i];
        }

        System.out.println("Resultant B array: ");
        for (int b : B) {
            System.out.print(b + " ");
        }

        System.out.println("\nMaximum XOR sum: " + maxXORSum);
    }
}

