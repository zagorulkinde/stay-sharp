package edu.algos.problems.stepic;

public class PrimitiveComparison {
    public static void main(String[] args) {
        long x = Long.MAX_VALUE;
        double y = (double) Long.MAX_VALUE;
        long z = Long.MAX_VALUE - 1;

        System.out.print((x == y) + "/");
        System.out.print((y == z) + "/");
        System.out.println((x == z) + "");
    }
}
