package com.xuxq.exercises.ex1_1.creative_problems;

import edu.princeton.cs.algs4.StdOut;

/**
 * TODO 二项分布
 *
 * 什么是二项分布？
 * 知乎 - 纽约Johnny哥的回答 https://www.zhihu.com/question/316063270
 * 简单来说，二项分布就是，求n次成功失败实验，出现k次成功的概率。
 *
 * 题解：
 * 参照https://algs4.cs.princeton.edu/11model/Binomial.java.html
 */
public class ex1_1_27 {

    public static void main(String[] args) {
        System.out.println(binomial3(5, 2, .25));

        System.out.println(5*4*0.25*0.25*0.75*0.75*0.75);


        System.out.println("c(5,5) = " + 1 * 0.25 * 0.25 * 0.25 * 0.25 * 0.25);
        System.out.println("c(5,4) = " + 5 * 0.25 * 0.25 * 0.25 * 0.25 * 0.75);
        System.out.println("c(5,3) = " + 10 * 0.25 * 0.25 * 0.25 * 0.75 * 0.75);
        System.out.println("c(5,2) = " + 10 * 0.25 * 0.25 * 0.75 * 0.75 * 0.75);
        System.out.println("c(5,1) = " + 5 * 0.25 * 0.75 * 0.75 * 0.75 * 0.75);
        System.out.println("c(5,0) = " + 1 * 0.75 * 0.75 * 0.75 * 0.75 * 0.75);
        // c(5,5)  1 * 0.25 * 0.25 * 0.25 * 0.25 * 0.25
        // c(5,4)  5 * 0.25 * 0.25 * 0.25 * 0.25 * 0.75
        // c(5,3)  10 * 0.25 * 0.25 * 0.25 * 0.75 * 0.75
        // c(5,2)  10 * 0.25 * 0.25 * 0.75 * 0.75 * 0.75
        // c(5,1) 5 * 0.25 * 0.75 * 0.75 * 0.75 * 0.75
        // c(5,0) 1 * 0.75 * 0.75 * 0.75 * 0.75 * 0.75

    }

    public static double binomial(int N, int k, double p) {
        StdOut.printf("N=%-5s k=%-5s p=%-5s", N, k, p);
        StdOut.println();
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;
        return (1.0 - p) * binomial(N-1, k, p) + p*binomial(N-1, k-1, p);
    }


    public static double binomial2(int N, int k, double p) {
        double[][] cache = new double[N][k];
        if (N == 0 && k == 0) return 1.0;
        if (N < 0 || k < 0) return 0.0;

        if (cache[N-2][k-1] == 0.0) {
            cache[N-2][k-1] = binomial2(N - 1, k, p);
        }

        if (cache[N-2][k-2] == 0.0) {
            cache[N-2][k-2] = binomial2(N-1, k-1, p);
        }

        return (1.0 - p) * cache[N-2][k-1] + p * cache[N-2][k-2];
    }


    public static double binomial3(int N, int k, double p) {
        double[][] b = new double[N+1][k+1];

        // base cases
        for (int i = 0; i <= N; i++)
            b[i][0] = Math.pow(1.0 - p, i);
        b[0][0] = 1.0;

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= k; j++) {
                StdOut.printf("%-15s", b[i][j]);
            }
            StdOut.println();
        }

        // recursive formula
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= k; j++) {
                b[i][j] = p * b[i-1][j-1] + (1.0 - p) *b[i-1][j];
            }
        }
        return b[N][k];
    }


}
