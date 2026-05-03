package tasks;

import java.util.Scanner;

public class KthSmallestElementSearch {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Search kth smallest element.");
        System.out.println("Enter array size: ");
        int arraySize = sc.nextInt();
        int[] numbers = new int[arraySize];

        System.out.println("Enter numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = sc.nextInt();
        }

        System.out.print("k = ");
        int requiredPosition = sc.nextInt();

        quickSort(numbers, 0, numbers.length -1);
        System.out.println(numbers[requiredPosition - 1]);
    }

    public static void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int pivotI = partition(numbers, low, high);
            quickSort(numbers, low, pivotI - 1);
            quickSort(numbers, pivotI + 1, high);
        }
    }
    public static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int smallerElement = low - 1;

        for (int j = low; j < high; j++) {
            if (numbers[j] <= pivot) {
                smallerElement++;
                int temp = numbers[smallerElement];
                numbers[smallerElement] = numbers[j];
                numbers[j] = temp;
            }
        }
        int temp = numbers[smallerElement + 1];
        numbers[smallerElement + 1] = numbers[high];
        numbers[high] = temp;
        return smallerElement + 1;
    }
}
