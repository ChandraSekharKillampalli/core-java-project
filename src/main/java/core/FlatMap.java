package core;

import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {
    public static void main(String args[]){
        String[][] multiArray = {{"a","b"}, {"c", "d"}, {"e", "f"}, {"g", "h"}};
        String[] singleArray = Stream.of(multiArray).flatMap(Stream :: of).toArray(String[] :: new);
        Arrays.stream(singleArray).forEach(System.out :: println);
    }
}
