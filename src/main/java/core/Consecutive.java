package core;

public class Consecutive {

    public static int countConsecutiveSumWays(int N) {
        int count = 0;

        for (int k = 1; k * (k + 1) / 2 < 2 * N; k++) {
            if ((2 * N) % k == 0) {
                int temp = (2 * N) / k - k + 1;
                if (temp > 0 && temp % 2 == 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int N = 100;
        int result = countConsecutiveSumWays(N);
        System.out.println("Number of ways to write " + N + " as sum of consecutive integers: " + result);
    }
}