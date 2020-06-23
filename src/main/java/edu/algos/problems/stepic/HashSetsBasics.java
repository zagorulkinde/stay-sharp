package edu.algos.problems.stepic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetsBasics {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] strings = reader.readLine().split(" ");
    List<Integer> helpList = getList();
    Set<Integer> set = new HashSet<>();

    for (String string : strings) {
      set.add(Integer.parseInt(string));
    }

    set.addAll(helpList);
    removeAllNumbersMoreThan10(set).forEach(System.out::println);
  }

  private static List<Integer> getList() {
    return Collections.emptyList();
  }

  public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set){
    //put your code here
    set.removeIf((e) -> e>10);
    return set;
  }
}
