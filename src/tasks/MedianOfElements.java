package tasks;

import java.util.Scanner;

public class MedianOfElements {
    public static void run() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Finding Median.");
        System.out.println("Enter array size: ");

        int arraySize = sc.nextInt();
        int[] numbers = new int[arraySize];

        System.out.println("Enter numbers: ");
        for (int i = 0; i < arraySize; i++) {
            numbers[i] = sc.nextInt();
        }

        mergeSort(numbers, 0, numbers.length - 1);
        if (arraySize % 2 == 1) {
            int median = numbers[arraySize / 2];
            System.out.println(median);
        }
        else if (arraySize % 2 == 0) {
            double median = (numbers[arraySize / 2 - 1] + numbers[arraySize / 2])/2.0;
            System.out.println(median);
        }
    }

    public static void mergeSort(int[] numbers, int low, int high) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(numbers, low, mid);
            mergeSort(numbers, mid + 1, high);
            merge(numbers,low,mid,high);
        }
    }
    public static void merge(int[] a, int low, int mid, int high) {
        int left = mid - low + 1;
        int right = high - mid;

        int[] Left = new int[left];
        int[] Right = new int[right];
        for (int i = 0; i < left; i++) {
            Left[i] = a[low + i];
        }
        for (int j = 0; j < right; j++) {
            Right[j] = a[mid + 1 + j];
        }

        int i = 0; int j = 0; int mergeIndex = low;
        while (i < left && j < right ) {
            if (Left[i] <= Right[j]) {
                a[mergeIndex] = Left[i];
                i++;
            } else {
                a[mergeIndex] = Right[j];
                j++;
            }
            mergeIndex++;
        }
        while (i < left) {
            a[mergeIndex] = Left[i];
            i++; mergeIndex++;
        }
        while (j < right) {
            a[mergeIndex] = Right[j];
            j++; mergeIndex++;
        }
    }
}

