package edu.algos.problems.stepic;

import java.util.Scanner;

public class TopN {

    public static void main(String[] args) {
        long sum = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextInt()) {
                int i = scanner.nextInt();
                sum = sum + i;

                if (i == 0) {
                    System.out.println(sum);
                    break;
                }
            }
        }
    }
}
