package com.xuxq.exercises.ex1_1;

public class ex1_1_18 {

    public static void main(String[] args) {
        System.out.println(mystery(2, 25));
        System.out.println(mystery(3, 11));

        System.out.println(mystery0(2, 3));
        System.out.println(mystery0(3, 3));

    }

    /**
     * 返回结果为给定整数的积
     *
     * @param a
     * @param b
     * @return a * b
     */
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a+a, b/2);
        return mystery(a+a, b/2) + a;
    }

    /**
     * 返回结果为a^b
     *
     * @param a
     * @param b
     * @return a^b
     */
    public static int mystery0(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery0(a*a, b/2);
        return mystery0(a*a, b/2) * a;
    }

}
