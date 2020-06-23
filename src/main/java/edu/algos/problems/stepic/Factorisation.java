package edu.algos.problems.stepic;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Factorisation {
    public static void main(String[] args) {
        int num;

        try (Scanner scanner = new Scanner(System.in).useDelimiter(System.lineSeparator())) {
            num = scanner.nextInt();
        }

        factorize(num);
    }

    private static void factorize(int n) {
        List<Integer> primes = new ArrayList<>();
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                primes.add(i);
                n = n / i;
                i--;
            }
        }
        primes.stream().sorted(Comparator.naturalOrder()).forEach(x -> System.out.print(x + " "));
    }
}
