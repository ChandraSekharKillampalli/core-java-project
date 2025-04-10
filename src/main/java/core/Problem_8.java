package core;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Write a program to find first non repeat element from a given string by Java Streams.
 *
 */
public class Problem_8 {
    public static void main(String[] args) {
        String input="iloveprogrammsng";
        //output->l
        System.out.println(firstNonRepatCharacter(input));

    }
    private static  String firstNonRepatCharacter(String input) {
        return Arrays.stream(input.split("")).collect(Collectors.groupingBy(in->in , LinkedHashMap :: new , Collectors.counting()))
                .entrySet().stream().filter(a->a.getValue()==1).map(Map.Entry::getKey).findFirst().get();

    }
}
