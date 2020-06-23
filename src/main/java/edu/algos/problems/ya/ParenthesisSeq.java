package edu.algos.problems.ya;

import java.util.Scanner;

public class ParenthesisSeq {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            genSec(scanner.nextInt());
        }
    }

    private static void genSec(int n) {
        char[] arr = new char[n * 2];
        generate(arr, 0, n, 0);
    }

    private static void generate(char[] arr, int idx, int n, int balance) {
        if (idx == 2 * n) {
            if (balance == 0) {
                print(arr);
            }
        } else {
            arr[idx] = '(';
            generate(arr, idx + 1, n, balance + 1);

            if (balance == 0) {
                return;
            }

            if (balance > 0) {
                arr[idx] = ')';
                generate(arr, idx + 1, n, balance - 1);
            }
        }
    }

    public static void print(char[] arr) {
        for (char c : arr) {
            System.out.print(c);
        }

        System.out.println();
    }
}
