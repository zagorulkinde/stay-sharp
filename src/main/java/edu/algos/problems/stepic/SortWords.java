package edu.algos.problems.stepic;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SortWords {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String str = scanner.nextLine();
            Map<Integer, Long> collect = Arrays.stream(str.split(" "))
                    .collect(Collectors.groupingBy(String::length, Collectors.counting()))
                    .entrySet()
                    .stream()
                    .sorted(Map.Entry.comparingByKey())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            collect.forEach((k, v) -> System.out.println(k + ": " + v));
        }
    }
}
