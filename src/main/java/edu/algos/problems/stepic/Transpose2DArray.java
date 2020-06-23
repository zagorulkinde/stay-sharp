package edu.algos.problems.stepic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Transpose2DArray {
  /*
   3 4
11 12 13 14
21 22 23 24
31 32 33 34

31 21 11
32 22 12
33 23 13
34 24 14
  */
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();

    try (Scanner scanner = new Scanner(System.in).useDelimiter(System.lineSeparator())) {
      while (scanner.hasNextLine()) {
        String i = scanner.nextLine();
        if (i.isEmpty()) {
          scanner.close();
          break;
        }
        strings.add(i);
      }
    }

    // init array
    final String first = strings.remove(0);
    final String[] split = first.split(" ");

    final int X0 = Integer.parseInt(split[0]);
    final int Y0 = Integer.parseInt(split[1]);
    int[][] arr = new int[X0][Y0];
    // fill
    for (int Y = 0; Y < strings.size(); Y++) {
      String string = strings.get(Y);
      final String[] s = string.split(" ");
      for (int X = 0; X < s.length; X++) {
        String s1 = s[X];
        arr[Y][X] = Integer.parseInt(s1);
      }
    }

    for (int i = 0; i < Y0; i++) {
      for (int j = X0 - 1; j != -1; j--) {
        System.out.print(arr[j][i]);
        if (j != 0) {
          System.out.print(" ");
        }
      }
      System.out.println();
    }
  }
}
