package edu.algos.problems.stepic;

import java.util.*;

public class QueuesStacksCreating {

  public static void main(String[] args) {
    Deque<String> queue = new ArrayDeque<>();
    queue.add("2");
    queue.add("0");
    queue.add("1");
    queue.add("7");

//    String [] strArr = new String[queue.size()] ;

    Set<Integer> set1 = new HashSet<>(Arrays.asList(3, 2, 1));
    Set<Integer> set2 = new HashSet<>(Arrays.asList(1, 2, 3));

    List<Integer> arList = new ArrayList<>();

    System.out.println("set1.equals(set2)? " + set1.equals(set2));


//    final String[] objects = Arrays.copyOf(queue.toArray(), queue.size(), String[].class);
//    System.out.println(Arrays.toString(objects));
  }
}
