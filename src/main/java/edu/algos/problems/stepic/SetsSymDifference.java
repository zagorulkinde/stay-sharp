package edu.algos.problems.stepic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SetsSymDifference {
  public static void main(String[] args) {
    final Set<Integer> integers = symDifference(new HashSet<>(Arrays.asList(1, 2, 3, 4)), new HashSet<>(Arrays.asList(3, 4, 5, 6)));
    System.out.println(integers);
  }

  public static Set<Integer> symDifference(Set<Integer> set1, Set<Integer> set2) {
    // find union
    Set<Integer> set3 = new HashSet<>(set1);
    set3.addAll(set2);
    // find intersection
    set1.retainAll(set2);
    // remove intersection from union
    set3.removeAll(set1);

    return set3;
  }
}
