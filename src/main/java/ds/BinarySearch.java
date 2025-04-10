package ds;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String...args){
        int[] nums = {1,2,5,4,20,45,19,7};
        Arrays.sort(nums);
        int searchedElement = searchAnElement(nums, 19);
        System.out.print("Searched Element Index:: " +searchedElement);
    }

    private static int searchAnElement(int[] nums, int target) {

        int start = 0;
        int end = nums.length-1;
        while(start <= end){
            int mid = (start + end)/2;
            if(nums[mid] == target){
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }
        return -1;
    }
}
