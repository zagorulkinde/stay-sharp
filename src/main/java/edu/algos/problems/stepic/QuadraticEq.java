package edu.algos.problems.stepic;

import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        int a;
        int b;
        int c;

        try (Scanner scanner = new Scanner(System.in).useDelimiter(System.lineSeparator())) {
            a = scanner.nextInt();
            b = scanner.nextInt();
            c = scanner.nextInt();
        }

        calcRoots(a, b, c);
    }

    private static void calcRoots(int a, int b, int c) {
        double d = Math.pow(b, 2) - 4 * a * c;

        if (d < 0) {
            return;
        }

        double x1;
        double x2;

        x1 = (-b - Math.sqrt(d)) / (2 * a);

        if (d == 0) {
            System.out.println(x1);
            return;
        }

        x2 = (-b + Math.sqrt(d)) / (2 * a);

        if (x1 > x2) {
            System.out.print(x1 + " " + x2);
        } else {
            System.out.print(x2 + " " + x1);
        }

    }

}
