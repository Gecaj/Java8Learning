package com.learning.java;

public class QuickSort {
    public void sort(int a[]) {
        quickSort(a, 0, a.length-1);
    }

    private void quickSort(int a[], int lo, int hi) {
        if (lo < hi) {
            int pivot = partition(a, lo, hi);
            quickSort(a, lo, pivot - 1);
            quickSort(a, pivot + 1, hi);
        }
    }

    private int partition(int[] a, int lo, int hi) {
        int pivot = a[hi];
        int i = lo;
        for (int j = lo; j < hi; j++) {
            if (a[j] <= pivot) swap(a, i++, j);
        }
        swap(a, i, hi);
        return i;
    }

    private void swap(int[] a, int i, int j) {
        int t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
