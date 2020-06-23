package edu.algos.problems.stepic;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.EnumMap;
import java.util.Scanner;
import java.util.function.BiFunction;

public class SImlpleCalc {
    private static EnumMap<Operations, BiFunction<Number, Number, Number>> operationFunction = new EnumMap<>(Operations.class);

    static {
        operationFunction.put(Operations.MINUS, (a, b) -> a.doubleValue() - b.doubleValue());
        operationFunction.put(Operations.PLUS, (a, b) -> a.doubleValue() + b.doubleValue());
        operationFunction.put(Operations.MULTIPLY, (a, b) -> a.doubleValue() * b.doubleValue());
        operationFunction.put(Operations.POW, (a, b) -> Math.pow(a.doubleValue(), b.doubleValue()));
        operationFunction.put(Operations.DIV, (a, b) -> {
            if (Double.compare(b.doubleValue(), 0) == 0) {
                return Double.NaN;
            } else {
                return Math.floorDiv(a.longValue(), b.longValue());
            }
        });
        operationFunction.put(Operations.REAL_DIV, (a, b) -> {
            if (Double.compare(b.doubleValue(), 0) == 0) {
                return Double.NaN;
            } else {
                return a.doubleValue() / b.doubleValue();
            }
        });
        operationFunction.put(Operations.MOD, (a, b) -> {
            if (Double.compare(b.doubleValue(), 0) == 0) {
                return Double.NaN;
            } else {
                return Math.floorMod(a.longValue(), b.longValue());
            }
        });
    }

    public static void main(String[] args) throws ParseException {
        Deque<String> inputNumbers = new ArrayDeque<>();
        try (Scanner scanner = new Scanner(System.in)) {
            while (scanner.hasNextLine()) {
                String s = scanner.nextLine();
                if (s.isEmpty()) {
                    break;
                }
                inputNumbers.push(s);
            }
        }

        String op = inputNumbers.pop();
        Operations operation = Operations.getOperation(op);
        NumberFormat formatter = NumberFormat.getInstance();
        formatter.setParseIntegerOnly(false);
        Number a = formatter.parse(inputNumbers.removeLast());
        Number b = formatter.parse(inputNumbers.removeLast());
        Number res = operationFunction.get(operation).apply(a, b);

        if (Double.isNaN(res.doubleValue())) {
            System.out.println("Division by 0!");
        } else {
            System.out.println(res);
        }
    }

    enum Operations {
        PLUS("+"),
        MINUS("-"),
        REAL_DIV("/"),
        MULTIPLY("*"),
        MOD("mod"),
        POW("pow"),
        DIV("div");

        private final String op;

        Operations(final String op) {
            this.op = op;
        }

        public static Operations getOperation(String op) {
            for (Operations value : Operations.values()) {
                if (value.op.equals(op)) {
                    return value;
                }
            }

            throw new IllegalArgumentException("Not found value:" + op);
        }

        @Override
        public String toString() {
            return op;
        }
    }
}
