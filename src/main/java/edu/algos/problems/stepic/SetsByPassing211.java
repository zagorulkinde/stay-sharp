package edu.algos.problems.stepic;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class SetsByPassing211 {
 public static void main(String[] args) {
    Set<String> nameSet = new TreeSet<>(Arrays.asList("Mr.Green", "Mr.Yellow", "Mr.Red"));
    nameSet.forEach(System.out::println);
 }

}
