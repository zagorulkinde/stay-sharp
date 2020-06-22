package edu.algos.problems;

public class ScalarMultiplication {

    public static void main(String[] args) {
        final ScalarMultiplication scalarMultiplication = new ScalarMultiplication();
        long scalarMultiply = scalarMultiplication.multiply(new Pair[]{
                new Pair(1, 3), new Pair(2, 2) // 1, 1, 1 // 2, 2
        }, new Pair[]{
                new Pair(1, 3), new Pair(3, 2), // 1 1 1 // 3, 3
        });
        // 3 + 12
        System.out.println(scalarMultiply + " " + 15);

        long scalarMultiplyNotEqual = scalarMultiplication.multiply(new Pair[]{
                new Pair(1, 6), // 1, 1, 1, 1, 1, 1
        }, new Pair[]{
                new Pair(2, 3), new Pair(3, 3) // 2, 2, 2, 3, 3, 3
        });

        System.out.println(scalarMultiplyNotEqual + " " + 15);

        long scalarMultiplyLengthyFirst = scalarMultiplication.multiply(new Pair[]{
                new Pair(2, 3), new Pair(1, 3) // 2, 2, 2, 1, 1, 1

        }, new Pair[]{
                new Pair(2, 6), // 2, 2, 2, 2, 2, 2
        });

        System.out.println(scalarMultiplyLengthyFirst + " " + 18);
    }

    private long multiply(Pair[] a, Pair[] b) {
        long scalarMulti = 0;

        int fa = 0;
        int aSize = a.length;
        int bSize = b.length;

        int aidx = 0;
        int bidx = 0;
        while (aidx != aSize - 1 && bidx != bSize - 1) {
            Pair curA = a[aidx];
            Pair curB = b[bidx];

            int diffFreq = curA.frequency - curB.frequency;
            if (diffFreq == 0) {
                scalarMulti += curA.frequency * curA.number * curB.number;
                aidx++;
                bidx++;
            }

            if (diffFreq > 0) {
//                scalarMulti += (curB.frequency
//
//                bidx++

            }

            if (diffFreq < 0) {

            }
        }


        return scalarMulti;
    }


    public static class Pair {
        int number;
        int frequency;

        public Pair(int number, int frequency) {
            this.number = number;
            this.frequency = frequency;
        }
    }
}
