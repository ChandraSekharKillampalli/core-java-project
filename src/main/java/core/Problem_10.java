package core;

import java.util.Arrays;

/**
 *
 * @author vivek.kumar2
 *
 */
public class Problem_10 {
    public static void main(String[] args) {
        //find the longest string in given input array
        String [] arrayInput = {"vivek"  , "kadiyan" , "ram" , "chaudhary vivek kadiyan"};
        String longestString = Arrays.stream(arrayInput).reduce((word1 , word2)-> word1.length() > word2.length() ? word1 : word2).get();
        System.out.println(longestString);
    }
}