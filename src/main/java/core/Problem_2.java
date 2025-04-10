package core;
/**
 * Write a program to find the duplicate characters in list of string . Only java stream will be accepted
 */

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem_2 {
    public static void main(String[] args) {
        String input="vivek kadiyan";
        List<String> duplicateCharacter = findDuplicateCharacter(input);
        System.out.println("Duplicate character::::"+duplicateCharacter);
        List<Integer> numbers = Arrays.asList(2,3,4,5);
        int even = numbers.stream().filter(i -> i%2 ==0).reduce(0, (ans, i) -> ans +i);
        System.out.println("Even::"+ even);
    }
    private static List<String> findDuplicateCharacter(String input){
        return Arrays.stream(input.split("")).collect(Collectors.groupingBy(ch->ch , Collectors.counting()))
                .entrySet().stream().filter(cha->cha.getValue()>1).map(in->in.getKey()).collect(Collectors.toList());
    }
}