package edu.algos.problems.stepic;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
* 3 4
0 1 0 1
1 0 0 1
1 1 1 1
2
*
* */
public class Cinema {
  public static void main(String[] args) {
    List<String> strings = new ArrayList<>();
    try (Scanner scanner = new Scanner(System.in)
            .useDelimiter(System.lineSeparator())) {
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
    final int K = Integer.parseInt(strings.remove(strings.size() - 1));

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

    int cur = 0;
    int[] I = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
      for (int y = 0; y < arr[i].length; y++) {
        if (arr[i][y] == 0) {
          cur++;
          if (I[i] < cur) {
            I[i] = cur;
          }
        } else {
          cur = 0;
        }
      }
      if (I[i] < cur) {
        I[i] = cur;
      }
      cur = 0;
    }

    boolean pr = false;

    for (int i1 = 0; i1 < I.length; i1++) {
      int i = I[i1];
      if (i == K) {
        System.out.println(i1 + 1);
        pr = true;
        break;
      }
    }

    if (!pr) {
      System.out.println(0);
    }
  }
}
