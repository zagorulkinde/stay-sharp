package edu.algos.problems.stepic;

import java.util.Scanner;

public class Squirrel {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int k = scanner.nextInt();
            int n = scanner.nextInt();
            System.out.println((n  - (n%k)) / k);
        }
    }
}
