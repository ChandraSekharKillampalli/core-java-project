package core;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * Write a program to find second-highest element from an array , Array can contain duplicate elements . Solve it by stream java 8.
 *
 */
public class Problem_9 {
    public static void main(String[] args) {
        int array[] = {1,3,2,4,5,6,6,9,9,10,11};
        System.out.println(nthHighestElementFromArray(array));
    }

    public static Integer nthHighestElementFromArray(int input[]) {
        return Arrays.stream(input).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
    }
}
