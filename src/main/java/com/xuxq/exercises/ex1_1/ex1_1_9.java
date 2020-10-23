package com.xuxq.exercises.ex1_1;

public class ex1_1_9 {

    public static void main(String[] args) {
        int N = 7;
        System.out.println(toBinary(N));

        // Java内置方法，实现更高效
        System.out.println(Integer.toBinaryString(N));
    }

    public static String toBinary(int num) {
        String result = "";

        while (num > 0) {
            result = num % 2 + result;
            num /= 2;
        }

        return result;
    }

}
