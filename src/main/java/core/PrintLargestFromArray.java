package core;

import java.util.Arrays;

public class PrintLargestFromArray {

        static String printLargest(int n, String[] arr) {
            // code here
            Arrays.sort(arr,(a, b)->(a+b).compareTo(b+a));
            String ans="";
            for(int i=n-1;i>=0;i--){
                ans+=arr[i];
            }
            return ans;
        }

        public static void main(String...args){
            String arr[] = {"5", "10", "45", "20", "36"};
            String res = printLargest(5, arr);
            System.out.print(res);
        }

}
