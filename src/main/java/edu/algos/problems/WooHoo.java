package edu.algos.problems;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WooHoo {

    public static void main(String[] args) throws Exception {
        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
            String J = r.readLine();
            String S = r.readLine();
            int result = getCommonSymbol(J, S);
            System.out.println(result);
        }
    }

    private static int getCommonSymbol(String j, String s) {
        int result = 0;
        for (int i = 0; i < s.length(); ++i) {
            char ch = s.charAt(i);
            if (j.indexOf(ch) >= 0) {
                ++result;
            }
        }
        return result;
    }
}