package view;

import java.util.Arrays;

public class Principal {

    public static void main(String[] args) {
        int[] arr = {10, 5, 8, 1, 9, 2, 4, 7, 3, 6};
        System.out.println("Lista original: " + Arrays.toString(arr));
        
        quickSort(arr, 0, arr.length - 1);

        System.out.println("Lista ordenada: " + Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);

            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}

