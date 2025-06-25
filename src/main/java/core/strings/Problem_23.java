package core.strings;

import java.util.*;

public class Problem_23 {
    /*
    * Find max sum

    Define a list of integer [1,3,4,7,2,5]
    find out which two number will have the max sum
    print the index and sum result
    * */

    //we will take sum = 0, and loop it across

    public static void main(String...args){
        int[] ar = {1,8,4,7,2,5};

        int sum = 0; int start = 0; int end = ar.length;
        int[] sumAr = new int[ar.length];
        Map<Integer, List<Integer>> sumMap = new HashMap<>();
        for(int i = 0; i < ar.length; i++){
            for(int j = i+1 ; j < end; j++){
                if(sumAr[i] > (ar[i]+ ar[j])){
                    continue;
                }
                sumAr[i] = ar[i]+ ar[j];

                sumMap.put(sumAr[i], Arrays.asList(i,j));
            }
        }

        Arrays.stream(sumAr).forEach(System.out :: println);
        sum = Arrays.stream(sumAr).max().getAsInt();
        if(sumMap.containsKey(sum)){
             System.out.println("Max Sum: " + sum + " Indices: " + sumMap.get(sum));
        }
    }
}
