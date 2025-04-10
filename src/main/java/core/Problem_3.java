package core;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * Find the duplicate element and its occurrence in a given string ? Only java stream will be accepted
 *
 */
public class Problem_3 {

    public static void main(String[] args) {
        //duplicate character and its occurrence
        String input ="vivekkadiyan";
        System.out.println(findDuplicateCharacterAndOccurance(input));


    }
    private static Map<String,Long> findDuplicateCharacterAndOccurance(String input){
        return Arrays.stream(input.split("")).collect(Collectors.groupingBy(ch->ch ,LinkedHashMap::new, Collectors.counting())).entrySet().
                stream().filter(a->a.getValue() > 1).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

    }

}