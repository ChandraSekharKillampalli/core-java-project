package data_structures;

public class FindMinMax {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        int smallest = numbers[0];
        int largest = numbers[0];

        for (int number : numbers) {
            if (number < smallest) {
                smallest = number;
            }
            if (number > largest) {
                largest = number;
            }
        }

        System.out.println("Smallest element: " + smallest);
        System.out.println("Largest element: " + largest);
    }
}