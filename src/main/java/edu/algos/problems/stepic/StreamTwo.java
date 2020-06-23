package edu.algos.problems.stepic;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTwo {

  public static IntStream createFilteringStream(IntStream evenStream, IntStream oddStream) {

    return IntStream.concat(evenStream, oddStream)
        .boxed()
        .filter(v -> v % 3 == 0 && v % 5 == 0)
        .sorted((o1, o2) -> o1 > o2 ? 1 : (o1.equals(o2) ? 0 : -1))
        .skip(2)
        .mapToInt(r -> r);
  }

  public static void main(String[] args) {
    System.out.println(
        createFilteringStream(IntStream.of(30, 75), IntStream.of(60, 90)).boxed().collect(Collectors.toList())
    );
  }
}
