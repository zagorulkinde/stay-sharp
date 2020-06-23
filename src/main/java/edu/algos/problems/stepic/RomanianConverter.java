package edu.algos.problems.stepic;

import java.util.EnumMap;
import java.util.Scanner;

public class RomanianConverter {
    private static final EnumMap<RomanianNumbers, Integer> ROMANIAN_MAPPING = new EnumMap<>(RomanianNumbers.class);

    static {
        ROMANIAN_MAPPING.put(RomanianNumbers.I, 1);
        ROMANIAN_MAPPING.put(RomanianNumbers.V, 5);
        ROMANIAN_MAPPING.put(RomanianNumbers.X, 10);
        ROMANIAN_MAPPING.put(RomanianNumbers.L, 50);
        ROMANIAN_MAPPING.put(RomanianNumbers.C, 100);
        ROMANIAN_MAPPING.put(RomanianNumbers.D, 500);
        ROMANIAN_MAPPING.put(RomanianNumbers.M, 1000);
    }

    public static void main(String[] args) {
        String[] number;
        try (Scanner scanner = new Scanner(System.in)) {
            number = scanner.next().split("");
        }
        // MCMLXXXIV
        long decNum = 0;
        for (int i = 0; i < number.length - 1; ++i) {
            Integer intBefore = ROMANIAN_MAPPING.get(RomanianNumbers.valueOf(number[i]));
            Integer intAfter = ROMANIAN_MAPPING.get(RomanianNumbers.valueOf(number[i + 1]));

            if (intBefore < intAfter) {
                decNum -= intBefore;
            } else {
                decNum += intBefore;
            }
        }
        decNum += ROMANIAN_MAPPING.get(RomanianNumbers.valueOf(number[number.length - 1]));
        System.out.println(decNum);
    }

    enum RomanianNumbers {
        I,
        V,
        X,
        L,
        C,
        D,
        M
    }
}
