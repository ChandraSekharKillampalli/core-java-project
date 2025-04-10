package core;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Problem_15
{
    public static void main(String args[])
    {
//performs multiplication
        BiFunction<Integer, Integer, Integer> bfobj = (a, b) -> a * b;
//performs division
        Function <Integer, Integer> fobj = (c) -> c / 2;
//composed function
        System.out.println("The result is: " + bfobj.andThen(fobj).apply(70, 10));

        String a = "1000";
        Integer i = Integer.parseInt(a,2);
        System.out.println(i);
    }
}