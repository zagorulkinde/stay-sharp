package edu.algos.problems.stepic;

import java.util.stream.LongStream;

public class IntGenTest {

  public static long sumOfOddNumbersInRange(long start, long end) {
    return LongStream.rangeClosed(start, end).filter((l) -> l % 2 != 0).sum();
  }

  @FunctionalInterface
  public static interface TernaryIntPredicate {
    public abstract boolean test(int a, int b, int c);
  }

  public static final TernaryIntPredicate allValuesAreDifferentPredicate = ((a, b, c) -> (a != b && b!=c ));
}
