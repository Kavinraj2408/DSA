package com.array;

public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {9, 5, 7, 3, 2, 8, 1};
        int size = arr.length;

        System.out.println("Before Sorting..");
        for (int n : arr) {
            System.out.print(n + " ");
        }

        mergeSort(arr, 0, size - 1);

        System.out.println();
        System.out.println("After Sorting..");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    private static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(arr, left, mid);
            mergeSort(arr, mid + 1, right);
            merge(arr, left, mid, right);
        }
    }

    private static void merge(int[] arr, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;
        int lArr[] = new int[n1];
        int rArr[] = new int[n2];

        for (int i = 0; i < n1; i++) {
            lArr[i] = arr[left + i];
        }
        for (int i = 0; i < n2; i++) {
            rArr[i] = arr[mid + 1 + i];
        }

        int a = 0;
        int b = 0;
        int c = left;

        while (a < n1 && b < n2) {
            if (lArr[a] <= rArr[b]) {
                arr[c] = lArr[a];
                a++;
            } else {
                arr[c] = rArr[b];
                b++;
            }
            c++;
        }

        while (a < n1) {
            arr[c] = lArr[a];
            a++;
            c++;
        }

        while (b < n2) {
            arr[c] = rArr[b];
            b++;
            c++;
        }
    }
}
