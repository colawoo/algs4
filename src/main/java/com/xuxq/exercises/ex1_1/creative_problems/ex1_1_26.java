package com.xuxq.exercises.ex1_1.creative_problems;

public class ex1_1_26 {
    public static void main(String[] args) {

        int a=0,b=10,c=5,t;
        // 执行完该if分支，保证了a < b
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }

        // 执行完该if分支，保证了a < c
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }

        // 执行完该if分支，保证了b < c
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }

        // 最终 a < b < c
        System.out.println("a=" + a + " b=" + b + " c=" + c);

    }
}
