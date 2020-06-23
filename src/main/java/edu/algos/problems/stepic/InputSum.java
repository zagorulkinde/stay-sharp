package edu.algos.problems.stepic;

import java.util.Scanner;

public class InputSum {

  public static void main(String[] args) {
    long currentSum = 0;
    try (Scanner scanner = new Scanner(System.in).useDelimiter("\\n")) {
      while (scanner.hasNextInt()) {
        final int i = scanner.nextInt();
        if (i == 0) {
          scanner.close();
          break;
        }
        currentSum += i;
      }
    }

    System.out.println(currentSum);
  }
}
