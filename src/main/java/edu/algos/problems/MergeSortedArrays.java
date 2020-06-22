package edu.algos.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class MergeSortedArrays {
    private final static HashMap<Integer, Integer> distinctNum = new HashMap<>();

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int n = scanner.nextInt();

            for (int i = 0; i <= n; i++) {
                Arrays.stream(scanner.nextLine().split(" "))
                        .skip(1)
                        .mapToInt(Integer::parseInt)
                        .forEach(MergeSortedArrays::add);
            }
        }

        distinctNum.keySet().stream()
                .sorted()
                .forEach((k) -> {
                    for (int i = 0; i < distinctNum.get(k); i++) {
                        System.out.print(k + " ");
                    }
                });
    }

    public static void add(int i) {
        distinctNum.compute(i, (k, v) -> (v == null) ? 1 : v + 1);
    }
}
