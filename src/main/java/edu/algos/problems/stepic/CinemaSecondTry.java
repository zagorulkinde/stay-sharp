package edu.algos.problems.stepic;

import java.util.Scanner;

//Output data format
//
//    The program should output the row number in which there are k consecutive available seats.
//    If there are several such rows, output the number of the smallest such row. If there is no such row, output the number 0.
//
//    Sample Input:
//
//    3 4
//    0 1 0 1
//    1 0 0 1
//    1 1 1 1
//    2
//    Sample Output:
//
//    2
public class CinemaSecondTry {
  public static void main(String[] args) {
    int x, y, n;
    int[][] cinemaSeats;
    try (Scanner scanner = new Scanner(System.in).useDelimiter("\\R")) {
      final String[] s = scanner.nextLine().split(" ");
      y = Integer.parseInt(s[0]);
      x = Integer.parseInt(s[1]);

      cinemaSeats = new int[y][x];

      for (int i = 0; i < y; i++) {
        String[] rowSeats = scanner.nextLine().split(" ");
        for (int j = 0; j < rowSeats.length; j++) {
          cinemaSeats[i][j] = Integer.parseInt(rowSeats[j]);
        }
      }
      // the last one is number of seats
      n = scanner.nextInt();
    }
    for (int j = 0; j < cinemaSeats.length; j++) {
      int currentConsecSeat = 0;

      for (int i = 0; i < cinemaSeats[j].length; i++) {
        if (cinemaSeats[j][i] == 0) {
          currentConsecSeat++;

          if (currentConsecSeat == n) {
            System.out.println(j + 1);
            return;
          }

        } else {
          if (currentConsecSeat == n) {
            System.out.println(j + 1);
            return;
          }
          currentConsecSeat = 0;
        }
      }
    }
    System.out.println(0);
  }
}
