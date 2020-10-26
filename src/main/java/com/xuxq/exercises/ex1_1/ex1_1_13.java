package com.xuxq.exercises.ex1_1;

public class ex1_1_13 {

    public static void main(String[] args) {
        int m = 3;
        int n = 5;
        int[][] ints = build(m, n);
        print(ints);
        System.out.println("----------------------");
        int[][] ints1 = rowToCol(ints);
        print(ints1);
    }

    public static int[][] build(int m, int n) {
        int[][] result = new int[m][n];
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                result[i][j] = i + j;
            }
        }
        return result;
    }

    public static void print(int[][] ints) {

        for (int i=0; i<ints.length; i++) {
            for (int j=0; j<ints[i].length; j++) {
                System.out.print(ints[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }

    public static int[][] rowToCol(int[][] ints) {
        int m = ints.length;
        int n = ints[0].length;
        int[][] result = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                result[i][j] = ints[j][i];
            }
        }
        return result;
    }

}
