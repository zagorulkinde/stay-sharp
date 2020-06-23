package edu.algos.problems.stepic;


import java.util.Arrays;
import java.util.Scanner;

/*
* Given positive integer 𝑁. Find the number of positive integers less than 𝑁
*  such that their sum of digits (in decimal notation) is equal to the sum of digits in the number 𝑁.
* Output the number of such integers.

  Sample Input:
    123
  Sample Output:
     9
     *
     * найти количество целых чисел, каждое из которых положительное;
каждое из этих целых чисел строго меньше указанного положительного числа N;
сумма цифр в каждом таком числе равна сумме цифр в числе N;
вывести количество таких чисел в консоли.
* */
public class FindNumber {

  public static void main(String[] args) {
    int ret = 0;
    int n;

    try (Scanner scanner = new Scanner(System.in)) {
      n = scanner.nextInt();
    }

    int sum = getSum(n);

    for (int i = 0; i < n; i++) {
      if (getSum(i) == sum) {
        ret++;
      }
    }

    System.out.println(ret);
  }

  private static int getSum(int i) {
    String s = String.valueOf(i);
    return Arrays.stream(s.split("")).mapToInt(Integer::valueOf).sum();
  }
}
