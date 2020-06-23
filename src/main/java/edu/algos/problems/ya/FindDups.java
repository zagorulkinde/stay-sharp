package edu.algos.problems.ya;

import java.util.Scanner;


public class FindDups {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            removeSeqDubs(scanner, scanner.nextInt());
        }
    }

    private static void removeSeqDubs(Scanner s, int n) {
        int prev = 0;

        for (int i = 0; i < n; i++) {
            int cur = s.nextInt();

            if (i == 0) {
                prev = cur;
                // always print first element
                print(cur);
            }

            if (cur != prev) {
                print(cur);
            }

            prev = cur;
        }

    }

    private static void print(int i) {
        System.out.println(i);
    }
}
