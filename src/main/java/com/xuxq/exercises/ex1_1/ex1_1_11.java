package com.xuxq.exercises.ex1_1;

public class ex1_1_11 {

    public static void main(String[] args) {
        boolean[][] arr = new boolean[5][5];
        for (int i=0; i<arr.length; i++) {
            for (int j=0; j<arr[i].length; j++) {
                arr[i][j] = true;
            }
        }
        print(arr);
    }

    public static void print(boolean[][] arr) {

        int outterLen = arr.length;
        int innnerLen = arr[0].length;

        for (int i=-1; i<outterLen; i++) {
            if (i != -1) {
                System.out.print(i + 1);
                System.out.print("\t");
            }
            for (int j=-1; j<innnerLen; j++) {
                if (i == -1) {
                    System.out.print(j+1);
                    System.out.print("\t");
                    continue;
                }
                if (j == -1) {
                    continue;
                }
                if (arr[i][j]) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}
