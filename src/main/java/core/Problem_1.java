package core;
/**
 * Write a program to find first repeat element/character from a given string by Java Streams
 */

import java.util.*;
import java.util.stream.Collectors;

public class Problem_1 {
    public static void main(String[] args) {
        String input = "lovelove";

        Optional<String> result = Optional.ofNullable(Arrays.stream(input.split("")).
                collect(Collectors.groupingBy(a -> a, LinkedHashMap::new, Collectors.counting())).entrySet().stream().
                filter(a -> a.getValue() > 1).map(Map.Entry::getKey).findFirst().get());

        System.out.println(result);
        // Output: Optional[l]
        // print the first repeated character

        List<Integer> numbers = Arrays.asList(2,3,4,5);
        int sum = numbers.stream().reduce(0, (a,b) -> (a+b));
        int even = numbers.stream().filter(x -> x % 2 == 0).reduce(0, (ans,i) -> ans + i);
        System.out.println("Event::" + even);
        System.out.println("Sum::" + sum);
    }
}