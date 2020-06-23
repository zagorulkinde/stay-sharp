package edu.algos.problems.stepic;

import java.util.Scanner;

/*
*
* When Paul studied at school, he memorized the multiplication table by rectangular blocks.
*  For his practice it would be very nice to have a program, which outputs a block of the multiplication table.

Write a program, which gets four numbers 𝑎, 𝑏, 𝑐 and 𝑑 as input, each on its own line.
*  The program should output a fragment of multiplication table for all numbers of the interval [𝑎;𝑏] by all numbers of the interval [𝑐;𝑑].

Numbers 𝑎, 𝑏, 𝑐 and 𝑑 are natural ones and do not exceed 10, 𝑎≤𝑏, 𝑐≤𝑑.

Follow the output format from the example, use '\t' (tab character) to separate elements inside the line.
*  Adding a space instead of line break is performed by the "end" parameter of the print function:
Sample Input 3:

1
3
2
4
Sample Output 3:

	2	3	4
1	2	3	4
2	4	6	8
3	6	9	12
*
*
*
7
10
5
6
*
Correct output:
	5	6
7	35	42
8	40	48
9	45	54
10	50	60
* */
public class MultiplicationTable {
  public static void main(String[] args) {
    int num = 4;
    short[] in = new short[num];

    short a, b, c, d;
    try (Scanner scanner = new Scanner(System.in).useDelimiter("\\n")) {
      for (int i = 0; i < num; i++) {
        in[i] = (short) scanner.nextInt();
      }
    }

    a = in[0];
    b = in[1]; // cols
    c = in[2];
    d = in[3]; // rows

    int rows = b - a + 2;
    int cols = d - c + 2;
    int[][] table = new int[rows][cols];

    int i = 1;
    for (int k = a; k < b + 1; k++) {
      table[i][0] = k;
      i++;
    }

    int j = 1;
    for (int m = c; m < d + 1; m++) {
      table[0][j] = m;
      j++;
    }

    int[] row = table[0];
    for (int k = 1; k < table.length; k++) {
      for (int m = 1; m < table[k].length; m++) {
        table[k][m] = table[k][0] * row[m];
      }
    }

    boolean skipFirstElement = true;
    for (int[] ints : table) {
      for (int anInt : ints) {
        if (skipFirstElement) {
          System.out.print("  ");
          skipFirstElement = false;
        } else {
          System.out.print(anInt);
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
