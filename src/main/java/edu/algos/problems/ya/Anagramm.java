package edu.algos.problems.ya;

import java.util.Arrays;
import java.util.Scanner;

public class Anagramm {

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String s = scanner.nextLine();
            String j = scanner.nextLine();

            System.out.println(checkAnagram(s, j) ? "1" : "0");
        }
    }

    private static boolean checkAnagram(String s, String j) {
        if (s.length() != j.length()) {
            return false;
        }

        return checkAnagramm(s.toCharArray(), j.toCharArray());
    }

    private static boolean checkAnagramm(char[] s, char[] j) {
        int numLetters = 26;
        int aCode = 'a';
        if (s.length != j.length) {
            return false;
        }

        int[] sCounters = getfilledArray(numLetters);
        int[] jCounters = getfilledArray(numLetters);

        for (int i = 0; i < s.length; i++) {
            // shift
            sCounters[s[i] - aCode]++;
            jCounters[j[i] - aCode]++;
        }

        for (int i = 0; i < numLetters; i++) {
            if (sCounters[i] != jCounters[i]) {
                return false;
            }
        }

        return true;
    }

    private static int[] getfilledArray(int numLetters) {
        int[] c = new int[numLetters];
        Arrays.fill(c, 0);
        return c;
    }
}
