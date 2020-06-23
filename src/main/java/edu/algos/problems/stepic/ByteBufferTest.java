package edu.algos.problems.stepic;

import java.nio.DoubleBuffer;
import java.util.Arrays;

public class ByteBufferTest {

  public static void main(String[] args) {
    final DoubleBuffer doubleBuffer = DoubleBuffer.allocate(4);

    double[] a = new double[]{1, 2};
    double[] b = new double[]{3, 4};
    double[] c = new double[]{5, 6};

    doubleBuffer.put(a, 0, a.length);
    doubleBuffer.put(b);

    System.out.println(Arrays.toString(doubleBuffer.array()));
    doubleBuffer.rewind();
    doubleBuffer.put(c, 0, c.length);

    System.out.println(Arrays.toString(doubleBuffer.array()));
  }

}
