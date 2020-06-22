package edu.algos.sorting;

import java.util.Arrays;

public class QSort {
    public static void main(String[] args) {
        QSort qSort = new QSort();

        int[] a = {10, 9, 8, -1, 3, 5, 7};
        qSort.qsort(a, 0, a.length - 1);

        System.out.println(Arrays.toString(a));
    }

    public void qsort(int[] a, int lo, int hi) {

        if (lo < hi) {
            int pivot = partition(a, lo, hi);
            qsort(a, lo, pivot - 1);
            qsort(a, pivot + 1, hi);
        }

    }

    public int partition(int[] a, int lo, int hi) {

        int pivot = a[hi];
        int i = (lo - 1); // index of smaller element;

        for (int j = lo; j < hi; j++) {
            if (a[lo] < pivot) {
                i++;

                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }

        int temp = a[i + 1];
        a[i + 1] = a[hi];
        a[hi] = temp;

        return i + 1;
    }
}
