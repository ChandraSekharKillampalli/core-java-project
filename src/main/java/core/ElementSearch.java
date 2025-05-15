package core;

public class ElementSearch {
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5};
        int ind = find(ar, 1);
        System.out.print(ind);
    }
    private static int find(int[] ar, int val) {
        int low = 0, high = ar.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (ar[mid] == val) {
                return mid;
            } else if (ar[mid] < val) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }

}
