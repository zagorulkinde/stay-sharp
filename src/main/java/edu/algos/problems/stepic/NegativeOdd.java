package edu.algos.problems.stepic;

public class NegativeOdd {
    public static void main(String[] args) {
        System.out.println(isOdd(10));
        System.out.println(isOdd(11));
        System.out.println(isOdd(-11));
    }

    public static boolean isOdd(int i) {
        final int i1 = i % 2;
        System.out.println(i1);
        return i1 == 1;
    }
}
