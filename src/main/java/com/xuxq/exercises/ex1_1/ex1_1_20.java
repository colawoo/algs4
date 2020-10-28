package com.xuxq.exercises.ex1_1;

public class ex1_1_20 {

    public static void main(String[] args) {
        System.out.println(Math.log10(recursion(5)));
        System.out.println(Math.log10(tail_recursion(5, 1)));


        System.out.println(Math.log10(1) + Math.log10(2) + Math.log10(3) + Math.log10(4) + Math.log10(5));
        System.out.println(Math.log10(1 * 2 * 3 * 4 * 5));

        System.out.println(recursion_demo(5));
        System.out.println(tail_recursion_demo(5, Math.log10(1)));
    }

    /**
     * 递归实现
     *
     * @param num
     * @return
     */
    public static double recursion_demo(int num) {
        if (num == 1) return Math.log10(1);
        return Math.log10(num) + recursion_demo(num - 1);
    }


    /**
     * 尾递归实现
     *
     * @param num
     * @param ret
     * @return
     */
    public static double tail_recursion_demo(int num, double ret) {
        if (num == 1) return ret;
        return tail_recursion_demo(num - 1, ret + Math.log10(num));
    }


    /**
     * 阶乘 递归调用过程如下
     *
     * main()
     *  fun(5)
     *  	（5 * fun(4)）
     *  		(5 * （4 * fun(3)))
     *  			(5 * (4 * (3 * fun(2))))
     *  				(5 * (4 * (3 * (2 * fun(1)))))
     *  			(5 * (4 * (3 * (2 * 1))))
     *  		(5 * (4 * (3 * 2)))
     *  	(5 * (4 * 6))
     *  (5 * 24)
     * 120
     *
     * @param num
     * @return
     */
    public static long recursion(int num) {
        if (num == 1) return 1;
        return num * recursion(num - 1);
    }


    /**
     * 阶乘 尾递归调用过程如下
     *
     * main()
     *  fun(5,1)
     *  	fun(4, 5 * 1)
     *  		fun(3, 4 * 5 * 1)
     *  			fun(2, 3 * 4 * 5 * 1)
     *  				fun(1, 2 * 3 * 4 * 5 * 1)
     *  				return 2 * 3 * 4 * 5 * 1;
     *
     * @param num
     * @param ret
     * @return
     */
    public static long tail_recursion(int num, long ret) {
        if (num == 1) return ret;
        return tail_recursion(num - 1, num * ret);
    }

}
