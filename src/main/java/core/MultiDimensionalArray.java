package core;

import java.util.Arrays;
import java.util.stream.Collectors;

public class MultiDimensionalArray {
    public static void main(String[] args){
        int[][] multiArray = new int[3][4];
        int value = 0;
        for(int i = 0; i < multiArray.length; i++){
            for(int j = 0; j < multiArray[i].length; j++){
                multiArray[i][j] = value++;

            }
        }
        System.out.print(Arrays.deepToString(multiArray));
    }
}
