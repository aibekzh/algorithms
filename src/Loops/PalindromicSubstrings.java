package Loops;

import java.util.Arrays;

public class PalindromicSubstrings {

    public String link = "https://leetcode.com/problems/palindromic-substrings/";

    public static int countSubstrings(String s) {
        int count = 0;
        char[] arr = s.toCharArray();
        int[][] matrix = new int[arr.length][arr.length];

        for (int[] row : matrix) {
            Arrays.fill(row, 0);
        }

        for (int i = 0; i < arr.length; i++) {
            matrix[i][i] = 1;
            count++;
        }

        for (int col = 1; col < arr.length; col++) {
            for (int row = 0; row < col; row++) {
                if (col - row == 1 && arr[row] == arr[col]) {
                    count++;
                    matrix[row][col] = 1;
                } else if (matrix[row + 1][col - 1] == 1 && arr[row] == arr[col]) {
                    count++;
                    matrix[row][col] = 1;
                }
            }
        }

        return count;
    }
}
