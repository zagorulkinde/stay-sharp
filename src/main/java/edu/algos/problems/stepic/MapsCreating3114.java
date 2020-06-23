package edu.algos.problems.stepic;


import java.util.Comparator;
import java.util.TreeMap;

public class MapsCreating3114 {
  public static void main(String[] args) {
    TreeMap<String, Integer> map = new TreeMap<>(Comparator.naturalOrder());
    map.put("Omega", 24);
    map.put("Alpha", 1);
    map.put("Gamma", 3);

    System.out.println(map);
  }
}
