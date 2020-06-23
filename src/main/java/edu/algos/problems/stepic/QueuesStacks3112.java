package edu.algos.problems.stepic;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class QueuesStacks3112 {

    public static void main(String[] args) {
      Deque<Integer> queue = new ArrayDeque<>(Arrays.asList(1,2,3,4));
      queue.add(5);
      queue.pop();
      queue.pop();

      System.out.println(queue);
    }

}
