package com.xuxq.exercises.ex1_1;

/**
 * f    g
 * 0	1
 * 1	0
 * 1	1
 * 2	1
 * 3	2
 * 5	3
 * 8	5
 * 13	8
 * 21	13
 * 34	21
 * 55	34
 * 89	55
 * 144	89
 * 233	144
 * 377	233
 * 610	377
 */
public class ex1_1_6 {
    public static void main(String[] args) {
        int f = 0;
        int g = 1;

        for (int i = 0; i <= 15; i++) {
            System.out.print(f);
            System.out.print("\t");
            System.out.print(g);
            System.out.println();

            f = f + g;
            g = f - g;
        }
    }
}
