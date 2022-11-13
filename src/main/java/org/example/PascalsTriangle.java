package org.example;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalsTriangle = new ArrayList<>();
        List<Integer> rows;
        for (int i = 0; i < numRows; i++) {
            rows = new ArrayList<>();
            rows.add(1);
            for (int j = 1; j < i; j++) {
                rows.add(pascalsTriangle.get(i-1).get(j-1) + pascalsTriangle.get(i-1).get(j));
            }
            if (i > 0) {
                rows.add(1);
            }
            pascalsTriangle.add(rows);
        }
        return pascalsTriangle;
    }
}