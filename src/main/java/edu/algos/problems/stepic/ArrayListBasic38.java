package edu.algos.problems.stepic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListBasic38 {

    static List<String> changeList(List<String> list) {
        String maxString = Collections.max(list, Comparator.comparingInt(String::length));
        list.replaceAll((l) -> maxString);
        return list;
    }

    public static void main(String[] args) {
      final String goodMorning = "goodmorning";
      assert Arrays.asList(goodMorning, goodMorning, goodMorning, goodMorning)
                .equals(ArrayListBasic38.changeList(Arrays.asList("hi", "hello", goodMorning, "ass")));
    }
}
