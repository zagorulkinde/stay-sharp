package edu.algos.problems.stepic;

public class StaticPrio {
    public static final int END = Integer.MAX_VALUE;
    public static final int START = END - 100;

    public static void main(String[] args) {
        int count = 0;
        for (int i = START; i <= END; i++) {
            count++;
            System.out.println(count);
        }
    }
}
