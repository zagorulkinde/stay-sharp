package edu.algos.problems.stepic;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FlatMap {
  public static void main(String[] args) {
    List<Integer> numbers = Stream.of(1, 2, 3, 4, 5).collect(Collectors.toList());

    List<Integer> generated = numbers.stream()
        .flatMap(n -> Stream.generate(() -> n)
            .limit(n))
        .collect(Collectors.toList());

    // 12345

    List<Integer> generated2 = numbers.stream()
        .flatMapToInt(n -> IntStream.rangeClosed(1, n))
        .boxed()
        .collect(Collectors.toList());


    List<Integer> generated3 = numbers.stream()
        .flatMapToInt(n -> IntStream.iterate(n, val -> val + 1).limit(n))
        .boxed()
        .collect(Collectors.toList());

    List<Integer> generated4 = numbers.stream()
        .flatMap(Stream::of)
        .collect(Collectors.toList());


    System.out.println(generated);
    System.out.println(generated2);
    System.out.println(generated3);
    System.out.println(generated4);
  }
}
