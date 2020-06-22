package edu.algos.problems;

import java.util.HashMap;
import java.util.Map;
// Add any extra import statements you may need here

public class FBPairSums {

    // Add any helper functions you may need here

    // 1,2,3,4,3
    // 6

    //    1:1
    //    2:1
    //.   3:2
    //.   4:1

    // 2 traverse over map in use only values where count is > 0

    // 6 - 1 -> not found
    // 6 - 2 -> 4 fount
    //2: 0
    //4 : 0

    // These are the tests we use to determine if the solution is correct.
    // You can add your own at the bottom, but they are otherwise not editable!
    int test_case_number = 1;

    public static void main(String[] args) {
        new FBPairSums().run();
    }

    int numberOfWays(int[] arr, int k) {
        // Write your code here
        int pairs = 0;

        Map<Integer, Integer> freqMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            Integer cnt = freqMap.get(arr[i]);
            if (cnt == null) {
                freqMap.put(arr[i], 1);
            } else {
                freqMap.put(arr[i], ++cnt);
            }
        }

        for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
            if (entry.getValue() != 0) {

                Integer d = k - freqMap.get(entry.getKey());
                Integer dValue = freqMap.get(d);

                if (dValue != null) {
                    pairs += 1;
//                    int oc = entry.getValue() - 1;
//                    freqMap.put(entry.getKey(), oc);
                    freqMap.put(d, --dValue);
                }
            }
        }

        return pairs;
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
        int output_1 = numberOfWays(arr_1, k_1);
//        check(expected_1, output_1);

        int k_2 = 6;
        int[] arr_2 = {1, 5, 3, 3, 3};
        int expected_2 = 4;
        int output_2 = numberOfWays(arr_2, k_2);
//        check(expected_2, output_2);

        int k_3 = 6;
        int[] arr_3 = {1, 2, 3, 3, 4};

        System.out.println(sumsToTarget(arr_1, k_1));
        System.out.println(sumsToTarget(arr_2, k_2));
        System.out.println(sumsToTarget(arr_3, k_3));

        // Add your own test cases here

    }
}