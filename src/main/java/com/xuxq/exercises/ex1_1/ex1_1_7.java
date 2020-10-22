package com.xuxq.exercises.ex1_1;

public class ex1_1_7 {

    public static void main(String[] args) {
        test1();
        System.out.println("=============");
        test2();
        System.out.println("=============");
        test3();
    }

    private static void test1() {
        double t = 9.0;
        int i = 0;
        while (Math.abs(t - 9.0/t) > .001) {
            t = (9.0 / t + t) / 2.0;
            i++;
        }
        System.out.printf("%.5f\n", t); // 3.00009
        System.out.println("循环次数：" + i); // 4
    }

    private static void test2() {
        int sum = 0;
        for (int i = 1; i < 1000; i++) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum); // 999000
    }

    private static void test3() {
        int sum = 0;
        for (int i = 1; i < 1000; i *= 2) {
            for (int j = 0; j < 1000; j++) {
                sum++;
            }
        }
        System.out.println(sum); // 10000
    }


}
