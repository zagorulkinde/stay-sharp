package edu.algos.problems.stepic;

import java.util.Arrays;

public class EratosphenSieve {

    public static void main(String[] args) {
        getPrimes(75);
    }

    public static int[] getPrimes(int maxNum) {
        int numberOfPrimes = maxNum - 1;
        int[] allMembers = new int[maxNum];

        for (int i = 0; i < maxNum; i++) {
            allMembers[i] = i;
        }

        for (int i = 2; i < allMembers.length; i++) {
            if (allMembers[i] != 0) {
                for (int j = i + 1; j < allMembers.length - 1; j++) {
                    if (allMembers[j] % allMembers[i] == 0) {
                        allMembers[j] = 0;
                        numberOfPrimes = numberOfPrimes - 1;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(allMembers));

        return allMembers;
    }
}
