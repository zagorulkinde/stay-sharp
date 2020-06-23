package edu.algos.problems.stepic;

import java.util.stream.LongStream;

public class ISPrimeJava {

  public static boolean isPrime(final long number) {
    return LongStream.rangeClosed(1, (int) Math.sqrt(number))
        .filter((p) -> number % p == 0)
        .count() < 2;
  }

  public static void main(String[] args) {
    System.out.println(isPrime(4));
  }
}
