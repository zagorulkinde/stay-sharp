package edu.algos.problems.stepic;

public class Gcd {
    public static void main(String[] args) {
        // todo
    }

    private static int gcd(int a, int b) {
        while (b != 0) {
            a = a % b;

            int tmp = a;
            a = b;
            b = tmp;
        }

        return a;
    }

    private static int lcm(int a, int b) {
        return a / gcd(a, b) * b;
    }
}
