package edu.algos.problems.stepic;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class DifferentSqr {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            String sqrType = scanner.nextLine();
            Deque<Double> sqrArgs = new ArrayDeque<>();
            Sqr factory = SqrTypes.getFactory(SqrTypes.valueOf(sqrType));

            while (scanner.hasNext()) {
                double v = scanner.nextDouble();
                sqrArgs.push(v);
            }

            double[] doubles = sqrArgs.stream().mapToDouble(Double::doubleValue).toArray();
            System.out.println(factory.calcSqr(doubles));
        }

    }

    enum SqrTypes {
        triangle,
        rectangle,
        circle;

        public static Sqr getFactory(SqrTypes type) {
            switch (type) {
                case triangle:
                    return new SqrTriangular();
                case circle:
                    return new CircleSqr();
                case rectangle:
                    return new RectangleSqr();
                default:
                    throw new IllegalArgumentException(type.name());
            }
        }
    }

    public static abstract class Sqr {
        public abstract double calcSqr(double... args);
    }

    public static class SqrTriangular extends Sqr {

        @Override
        public double calcSqr(double... args) {
            double a = args[0];
            double b = args[1];
            double c = args[2];

            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    public static class RectangleSqr extends Sqr {

        @Override
        public double calcSqr(double... args) {
            double a = args[0];
            double b = args[1];

            return a * b;
        }
    }

    public static class CircleSqr extends Sqr {

        @Override
        public double calcSqr(double... args) {
            double r = args[0];
            double pi = 3.14;

            return pi * Math.pow(r, 2);
        }
    }
}
