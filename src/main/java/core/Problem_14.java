package core;

import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class Problem_14 {

    public static void main(String...args){
        String input = "GeeksForGeeks";
        List<String> dist = Arrays.asList(input.split(""));

        dist.stream().distinct().forEach(System.out::println);

        Stack<Integer> stInteger = new Stack<>();
        stInteger.push(10);

    }
}
