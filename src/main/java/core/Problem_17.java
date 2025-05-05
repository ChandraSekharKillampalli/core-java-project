package core;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

public class Problem_17 {

    public static void main(String...args) {
        String[] strArray = {"raj", "rahul", "ankita", "arpita", "priya"};

        //output : {p=[priya], a=[ankita, arpita], r=[raj, rahul]}

        Map<String, List<String>> result = Arrays.stream(strArray)
                .collect(Collectors.groupingBy(
                        s -> String.valueOf(s.charAt(0)),
                        TreeMap::new, // To keep keys sorted
                        Collectors.toList()
                ));

        System.out.println(result);
    }

}
