package edu.algos.problems.stepic;

import java.util.*;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;


public class PolyndromeCollector {

  public static void main(String[] args) {
    String[] words = "aaaa aaa a aa".split(" ");
    Map<Boolean, List<String>> palindromeOrNoMap = Arrays
        .stream(words)
        .collect(groupingBy(o -> new StringBuilder(o).reverse().toString().equals(o),
            () -> {
              final HashMap<Boolean, List<String>> booleanListHashMap = new HashMap<>();
              booleanListHashMap.put(true, new ArrayList<>());
              booleanListHashMap.put(false, new ArrayList<>());
              return booleanListHashMap;
            },
            toList()));
    System.out.println(palindromeOrNoMap);
  }

  static boolean test(String o) {
    return new StringBuilder(o).reverse().toString().equals(o);
    // groupingBy(Person::getCity,
    //     *                                              reducing(Person::getLastName, BinaryOperator.maxBy(byLength)))
  }
}
