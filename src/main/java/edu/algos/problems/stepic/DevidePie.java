package edu.algos.problems.stepic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DevidePie {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in).useDelimiter(System.lineSeparator())) {
            int numA = scanner.nextInt();
            int numB = scanner.nextInt();

            long i = divide(numA, numB);
            System.out.println(i);
        }
    }

    private static long divide(int a, int b) {
        final List<Integer> factorsA = factorize(a);
        final List<Integer> factorsB = factorize(b);

        if (factorsA.size() > factorsB.size()) {
            factorsB.forEach(factorsA::remove);
            long pp = factorsA.stream().reduce(1, (aa, bb) -> aa * bb).longValue();
            long pr = factorsB.stream().reduce(1, (aa, bb) -> aa * bb).longValue();

            return pp * pr;

        } else if (factorsB.size() > factorsA.size()) {
            factorsA.forEach(factorsB::remove);

            long pp = factorsA.stream().reduce(1, (aa, bb) -> aa * bb).longValue();
            long pr = factorsB.stream().reduce(1, (aa, bb) -> aa * bb).longValue();

            return pp * pr;
        } else {
            factorsA.forEach(factorsB::remove);

            if (factorsB.isEmpty()) {
                return factorsA.stream().reduce(1, (aa, bb) -> aa * bb).longValue();
            } else {
                long pp = factorsA.stream().reduce(1, (aa, bb) -> aa * bb).longValue();
                long pr = factorsB.stream().reduce(1, (aa, bb) -> aa * bb).longValue();

                return pp * pr;
            }
        }
    }

    private static List<Integer> factorize(int n) {
        List<Integer> ret = new ArrayList<>();

        for (int i = 2; i < n + 1; i++) {
            if (n % i == 0) {
                n = n / i;
                ret.add(i);
                i--;
            }
        }

        return ret;
    }
}
