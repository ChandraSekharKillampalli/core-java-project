package core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Write a program to find unique elements in given string by JAVA streams.
 *
 */
public class Problem_7 {
    public static void main(String[] args) {
        String input="vivekkadiyan";
        System.out.println(unquieElements(input));

    }
    private static List<String> unquieElements(String input){
        return Arrays.stream(input.split("")).collect(Collectors.groupingBy(in->in , Collectors.counting())).entrySet().stream()
                .filter(fi->fi.getValue()==1).map(Map.Entry::getKey).collect(Collectors.toList());
    }
}
