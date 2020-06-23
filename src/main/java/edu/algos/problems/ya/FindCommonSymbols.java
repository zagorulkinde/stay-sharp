package edu.algos.problems.ya;

import java.util.Scanner;


public class FindCommonSymbols {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String j = scanner.next();
            String s = scanner.next();
            System.out.println(findCommonSymbol(j, s));
        }
    }

    private static int findCommonSymbol(String j, String s) {
        int total = 0;
        for (int i = 0; i < s.length(); i++) {
            char cj = j.charAt(i);

            for (int k = 0; k < s.length(); k++) {
                char cs = s.charAt(k);

                if (cj == cs) {
                    total++;
                }
            }
        }

        return total;
    }




}
