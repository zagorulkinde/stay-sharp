package edu.algos.sorting;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(new int[]{2, 1, 4, 7, 5, 6})));
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(new int[]{2, 0, 3, 0, 0, 0})));
        System.out.println(Arrays.toString(bubbleSort.bubbleSort(new int[]{10, 8, 90, 0, -1, 0})));
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
