package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        String s = "asdasd";
        char[] arr = s.toCharArray();
        int[][] matrix = new int[arr.length][arr.length];

        for (int[] row : matrix){
            Arrays.fill(row, 0);
        }

        System.out.println(Arrays.deepToString(matrix));

    }
}
