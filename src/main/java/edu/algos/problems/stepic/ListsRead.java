package edu.algos.problems.stepic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;


public class ListsRead {

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    List<String> list = new ArrayList<>(java.util.Arrays.asList(reader.readLine().split(" ")));
    ListIterator<String> iterator = list.listIterator(list.size());

    while (iterator.hasPrevious()) {
      String n = iterator.previous();
      if (n.startsWith("J")) {
        String v = n.substring(1);
        iterator.set(v);
        System.out.println(v);
      } else {
        iterator.remove();
      }
    }
  }
}
