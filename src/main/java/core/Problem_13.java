package core;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Problem_13 {
    public static void main(String...args){
    List<Integer> integerList = Arrays.asList(4,5,6,7,1,2,3);

    List<Integer> cubeList = integerList.stream().filter(num -> Math.pow(num, 3) > 50).collect(Collectors.toList());
    cubeList.forEach(System.out :: println);

        String inputString = "Problem";
        for (int i = 0; i < inputString.length(); i++)
        {
            for (int j = i+1; j <= inputString.length(); j++)
            {
                System.out.println(inputString.substring(i, j));
            }
        }
    }
}
