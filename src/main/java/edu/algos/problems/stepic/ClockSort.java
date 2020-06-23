package edu.algos.problems.stepic;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class ClockSort {

  public static void main(String[] args) {
    int i = 0;
    Time[] times;

    try (Scanner scanner = new Scanner(System.in)) {
      int num = scanner.nextInt();

      times = new Time[num];

      while (scanner.hasNextLine() && i < num) {
        String s = scanner.nextLine();
        if (s.length() > 0) {
          Time time = new Time(s);
          times[i] = time;
          i++;
        }
      }
    }

    Comparator<Time> c = Comparator
        .comparing(Time::getH)
        .thenComparing(Time::getM)
        .thenComparing(Time::getS);

    Arrays.sort(times, c);


    for (Time time : times) {
      System.out.println(time);
    }

    /*
    3
    13 15 0
    9 45 0
    23 59 59
    */

//    9 45 0
//    13 15 0
//    23 59 59
  }

  public static class Time {
    private final int h;
    private final int m;
    private final int s;

    public Time(String inputLine) {
      String[] s = inputLine.split(" ");
      this.h = Integer.parseInt(s[0]);
      this.m = Integer.parseInt(s[1]);
      this.s = Integer.parseInt(s[2]);
    }

    public int getH() {
      return h;
    }

    public int getM() {
      return m;
    }

    public int getS() {
      return s;
    }

    @Override
    public String toString() {
      return h + " " + m + " " + s;
    }
  }
}
