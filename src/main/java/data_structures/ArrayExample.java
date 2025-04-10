package data_structures;

import java.util.Arrays;

public class ArrayExample {

    public static void main(String...args){
    int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = intArray.length-i;
        }
        Arrays.stream(intArray).sorted().forEach(System.out :: println);

        Integer[] intA = new Integer[]{89, 20, 34, 45, 66, 22, 99};
        Arrays.stream(intA).sorted().forEach(System.out::println);
    }
}
