package com.xuxq.exercises.ex1_1;

/**
 * 求小于等于log2(N)的最大整数
 * 思路：若a^n = b (a>0,a!=1), 则n = loga(b)
 * 可以采用累乘或累除
 */
public class ex1_1_14 {

    public static void main(String[] args) {
        lg(18);
    }

    public static void lg(int num) {
        if (num <= 0) {
            System.out.println("必须是大于0的整数。");
        }

        int result = 0;
        while (num >= 2) {
            num /= 2;
            result++;
        }
        System.out.println(result);
    }

}
