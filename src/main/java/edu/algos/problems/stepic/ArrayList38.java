package edu.algos.problems.stepic;

import java.util.Arrays;
import java.util.List;

public class ArrayList38 {
  public static Integer maxElem(List<Integer> list) {
    int max = Integer.MIN_VALUE;
    for (Integer i : list) {
      max = Integer.max(max, i);
    }
    return max;
  }

  public static void main(String[] args) {
    assert maxElem(Arrays.asList(847, 271, 663, 473, 376, 133, 693, 13, 382, 879)) == 879;
  }
}
