package edu.algos.problems;

import java.util.HashMap;
import java.util.Map;

public class FBPairSums {
    int test_case_number = 1;

    public static void main(String[] args) {
        new FBPairSums().run();
    }


    private int sumsToTarget(int[] arr, int k) {
        Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();
        int pairSum = 0;

        // O(n)
        for (int i = 0; i < arr.length; i++) {
            freqMap.compute(arr[i], (o, v) -> v == null ? 1 : ++v);
        }
        // O(n) - worst case
        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            int reminder = k - entry.getKey();
            // O(1)
            Integer freq = freqMap.get(reminder);

            if (freq != null && !freq.equals(0)) {
                if (freq > 2) {
                    pairSum += freq;
                } else {
                    pairSum += 1;
                }

                // decrease freq
                // O(1)
                Integer t = freqMap.get(freq);
                // O(1)
                freqMap.put(reminder, --t);
                // decrease number
                Integer v = entry.getValue();
                freqMap.put(entry.getKey(), --v);
            }
        }

        return pairSum;
    }

    void check(int expected, int output) {
        boolean result = (expected == output);
        char rightTick = '\u2713';
        char wrongTick = '\u2717';
        if (result) {
            System.out.println(rightTick + " Test #" + test_case_number);
        } else {
            System.out.print(wrongTick + " Test #" + test_case_number + ": Expected ");
            printInteger(expected);
            System.out.print(" Your output: ");
            printInteger(output);
            System.out.println();
        }
        test_case_number++;
    }

    void printInteger(int n) {
        System.out.print("[" + n + "]");
    }

    public void run() {
        int k_1 = 6;
        int[] arr_1 = {1, 2, 3, 4, 3};
        int expected_1 = 2;
        int output_1 = sumsToTarget(arr_1, k_1);
        check(expected_1, output_1);

        int k_2 = 6;
        int[] arr_2 = {1, 5, 3, 3, 3};
        int expected_2 = 4;
        int output_2 = sumsToTarget(arr_2, k_2);
        check(expected_2, output_2);

        int k_3 = 6;
        int[] arr_3 = {1, 2, 3, 3, 4};
        int expected_3 = 2;
        int output_3 = sumsToTarget(arr_3, k_3);
        check(expected_3, output_3);
    }
}