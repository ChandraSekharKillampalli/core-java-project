package core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
/**
 *
 * Write a Java program to find all elements from array which starts from 2 using stream API.
 */
public class Problem_11 {

    public static void main(String[] args) {
        int inputArray[] = {1,25,34,45,26,26,37};
        List<String> output = Arrays.stream(inputArray).boxed().map(d->d.toString()).filter(b->b.startsWith("2")).collect(Collectors.toList());
        System.out.println(output);

    }

}
