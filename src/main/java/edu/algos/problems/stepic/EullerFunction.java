package edu.algos.problems.stepic;

import java.util.Scanner;

public class EullerFunction {

  public static void main(String[] args) {
    try (Scanner scanner = new Scanner(System.in)) {
      int i = scanner.nextInt();
      System.out.println(phi(i));
    }
  }

  public static int phi(int n) {
    int result = n;
    for (int i = 2; i * i <= n; ++i)
      if (n % i == 0) {
        while (n % i == 0) {
          n /= i;
        }
        result -= result / i;
      }
    if (n > 1) {
      result -= result / n;
    }
    return result;
  }
}
