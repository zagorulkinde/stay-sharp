package edu.algos.problems.stepic;

/*
Write a collector that evaluates the product of squares of integer numbers in a Stream<Integer>.

Important. You should write only the collector in any valid formats but without ; on the end.
It will be passed as an argument to the collect() method of a stream as shown below.

List<Integer> numbers = ...
long val = numbers.stream().collect(...your_collector_will_be_passed_here...);
* **/

import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class ColCollectors {

  public static void main(String[] args) {
//    List<Integer> numbers = asList(0, 1, 2, 3); // 0
    List<Integer> numbers = asList(1, 2); // 4
    long ret = numbers.stream().collect(
        Collectors.reducing(1L,
        (l) -> l.longValue() * l.longValue(),
        (a,b) -> a*b)
    );

    System.out.println(ret);
  }
}
