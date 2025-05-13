package data_structures;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseArray {
    public static void main(String args[]){
        Integer[] ar = {1,2,3,4,5,6};
        int[] arr = {1,2,3,4,5,6};
        reverseArray(ar);
        reverseArrayWithLoop(arr);
        System.out.print(Arrays.toString(ar));
        System.out.println(Arrays.toString(arr));
    }

    private static void reverseArrayWithLoop(int[] arr) {
        int left = 0, right = arr.length-1;
        while(left < right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }

    private static void reverseArray(Integer[] ar){
        Collections.reverse(Arrays.asList(ar));
    }
}
