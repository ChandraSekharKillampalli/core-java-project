package core;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
/**
 *
 * Find Nth salary in given map . Only Java 8 stream solution will be accepted
 * e.g
 * Student has name and salary
 * Map will be like Map<String , Student >
 *
 */
public class Problem_6 {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("vivek", 100);
        map.put("Rinku", 400);
        map.put("vishal", 600);
        map.put("shankar", 500);
        map.put("shyam", 500);
        map.put("tinku", 300);
        System.out.println(findNthSalary(map , 1));
    }

    private static Map.Entry<Integer , List<String>> findNthSalary(Map<String , Integer> map , int nth ) {

        return	map.entrySet().stream().collect(Collectors.groupingBy(a->a.getValue() ,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).
                collect(Collectors.toList()).get(nth-1);



    }
}
