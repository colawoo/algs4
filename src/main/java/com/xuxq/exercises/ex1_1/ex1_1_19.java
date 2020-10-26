package com.xuxq.exercises.ex1_1;

/**
 * 递归及递归优化
 *
 *     普通递归存在的问题：
 *          1.调用栈过深，容易栈溢出。
 *          2.重复计算。
 *
 *     递归优化：
 *          1.使用尾递归，避免栈溢出。
 *          2.使用缓存存储已计算过的结果，避免重复计算。
 */
public class ex1_1_19 {

    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        int N = 101;
        long[] cache = new long[N];
        for (int i=0; i<N; i++) {
            System.out.println(i + "\t" + fibonacci_cache(cache, i));
        }
        long end = System.currentTimeMillis();
        System.out.println((end - start) / 1000);
    }


    /**
     * 递归实现fibonacci
     *
     * @param num
     * @return
     */
    public static long fibonacci_ecursion(int num) {
        if (num ==0) return 0;
        if (num == 1) return 1;
        return fibonacci_ecursion(num-1) + fibonacci_ecursion(num-2);
    }


    /**
     * 空间换时间，将计算结果存储下来，避免重复计算。
     *
     * @param cache
     * @param num
     * @return
     */
    public static long fibonacci_cache(long[] cache, int num) {
        if (num == 0) {
            cache[0] = 0L;
            return cache[num];
        }
        if (num == 1) {
            cache[1] = 1L;
            return cache[num];
        }
        if (cache[num] == 0L) {
            cache[num] = fibonacci_cache(cache, num - 1) + fibonacci_cache(cache, num - 2);
            return cache[num];
        }
        return cache[num];
    }


    /**
     * 尾递归实现fibonacci
     *      可以参考 阮一峰 尾调用优化 http://www.ruanyifeng.com/blog/2015/04/tail-call.html
     *      只会保存尾调用的栈帧数据
     *
     * @param num
     * @param ret1
     * @param ret2
     * @return
     */
    public static long  fibonacci_tail_recursion(int num, long ret1, long ret2) {
        if (num == 0) return ret1;
        else return fibonacci_tail_recursion(num-1, ret2, ret1 + ret2);
    }

}
