package core;

public class SumOfSubArrays {
    public static void main(String args[]){
        int[] ar = {1,2,3,4,5};
        int n = ar.length;
        int sum = 0;
        for (int i = 0; i < n; i++){
            sum = sum + ar[i]* (i+1) * (n-i);
        }
        System.out.println("Sum:: "+ sum);
    }
}
