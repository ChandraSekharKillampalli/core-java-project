package core;

public class FindFirstNonRepeatingElement {
    public static void main(String...args){
        int a[] = {1,2,3,1,2};
        int ans = findFirstNonRepeatingElement(a, a.length);
        System.out.print(ans);
    }

    static int findFirstNonRepeatingElement(int arr[], int n)
    {
        // Loop for checking each element
        for (int i = 0; i < n; i++) {
            int j;
            // Checking if ith element is present in array
            for (j = 0; j < n; j++)
                if (i != j && arr[i] == arr[j])
                    break;
            // if ith element is not present in array
            // except at ith index then return element
            if (j == n)
                return arr[i];
        }

        return -1;
    }

}
