package edu.algos.sorting;


import java.util.Arrays;

public class BbubbleSort {
    public static void main(String[] args) {
        int[] a = {-1, 6, 10, -10, 2, 1, 0, 5, 9, 3};
        System.out.println(Arrays.toString(new BbubbleSort().bubbleSort(a)));
    }

    public int[] bubbleSort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (data[i] < data[j]) {
                    int temp = data[j];
                    data[j] = data[i];
                    data[i] = temp;
                }
            }
        }

        return data;
    }
}
