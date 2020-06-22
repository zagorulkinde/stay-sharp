package edu.algos.problems;

import java.util.Scanner;

public class FindSeqOne {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();
            int[] ints = new int[n];
            for (int i = 0; i < n; i++) {
                ints[i] = scanner.nextInt();
            }
            System.out.println(findSeqNum(ints));
        }
    }

    private static int findSeqNum(int[] ints) {
        int result = 0;
        int current = 0;
        for (int i = 0; i < ints.length; i++) {
            if (ints[i] == 1) {
                current++;
            } else {
                if (current > result) {
                    result = current;
                }
                current = 0;
            }
        }
        return Math.max(result, current);
    }
}
