package edu.algos.problems.stepic;

import java.util.Map;
import java.util.TreeMap;

public class MapsBypassing3115 {

  public static void main(String[] args) {
    Map<String, Integer> map = new TreeMap<>();
    map.put("Gamma", 3);
    map.put("Omega", 24);
    map.put("Alpha", 1);

    map.forEach((k, v) -> {
      System.out.println(k + "=" + v);
    });
  }
}
