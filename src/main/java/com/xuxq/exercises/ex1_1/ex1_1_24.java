package com.xuxq.exercises.ex1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

/**
 * java -Dfile.encoding=UTF-8 -classpath /Users/mac/Workspace/IdeaProjects/algs4/target/classes:/Users/mac/.m2/repository/edu/princeton/cs/algs4/1.0.4/algs4-1.0.4.jar com.xuxq.exercises.ex1_1.ex1_1_24 1111111 1234567
 */
public class ex1_1_24 {

    public static void main(String[] args) {
        int p = Integer.parseInt(args[0]);
        int q = Integer.parseInt(args[1]);
        System.out.println(gcd(p, q));
    }

    /**
     * 最大公约数 - Greatest Common Divisor
     *
     * 欧几里得算法（Euclid's algorithm，又叫辗转相除法）
     * 用于计算两个非负整数的最大公约数。
     * 计算公式：gcd(p,q) = gcd(q, p mod q)
     */
    public static int gcd(int p, int q) {
        StdOut.printf("p=%-2s  q=%-2s", p, q);
        StdOut.println();
        if (q == 0) return p;
        return gcd(q, p % q);
    }

}
