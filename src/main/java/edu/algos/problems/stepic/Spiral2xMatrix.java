package edu.algos.problems.stepic;

import java.util.Scanner;

public class Spiral2xMatrix {
    private static void createSpiralMatrix(int n) {

        int counter = 1;

        int[][] spiralArray = new int[n][n];

        int xStart = 0;
        int xEnd = n - 1;
        int yStart = 0;
        int yEnd = n - 1;

        while (counter < (n * n) + 1) {
            for (DIRECTION value : DIRECTION.values()) {
                switch (value) {
                    case LEFT_RIGHT:
                        for (int i = xStart; i <= xEnd; i++) {
                            spiralArray[yStart][i] = counter++;
                        }
                        break;
                    case UP_DOWN:
                        yStart = yStart + 1;
                        for (int j = yStart; j <= yEnd; j++) {
                            spiralArray[j][xEnd] = counter++;
                        }
                        break;
                    case RIGHT_LEFT:
                        xEnd = xEnd - 1;
                        for (int i = xEnd; i >= xStart; i--) {
                            spiralArray[yEnd][i] = counter++;
                        }
                        break;
                    case DOWN_UP:
                        yEnd = yEnd - 1;
                        for (int j = yEnd; j >= yStart; j--) {
                            spiralArray[j][xStart] = counter++;
                        }
                        xStart = xStart + 1;
                        break;
                    default:
                        throw new IllegalArgumentException("Unknown:" + value);
                }

            }
        }
        printArray(spiralArray);
    }

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            createSpiralMatrix(scanner.nextInt());
        }
    }

    private static void printArray(int[][] spiralArray) {
        for (int[] ints : spiralArray) {

            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    enum DIRECTION {
        LEFT_RIGHT,
        UP_DOWN,
        RIGHT_LEFT,
        DOWN_UP
    }
}
