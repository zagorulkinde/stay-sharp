package edu.algos.problems.stepic;

import java.util.Arrays;

public class BubleSort {
    public static void main(String[] args) {
        int[] a = {-1, 6, 10, -10, 2, 1, 0, 5, 9, 3};
        new BubleSort().sortArray(a);
    }

    private void sortArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length; j++) {

                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        System.out.println(Arrays.toString(a));
    }
}
