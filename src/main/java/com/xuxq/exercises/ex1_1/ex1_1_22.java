package com.xuxq.exercises.ex1_1;

import edu.princeton.cs.algs4.StdOut;

public class ex1_1_22 {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,9,14,15,38,56,78};
        int key = 14;
        System.out.println(rank(arr, key, 0, arr.length-1, 0));
    }

    /**
     * 递归实现二分查找
     *
     * @param arr 有序数组
     * @param key
     * @param lo
     * @param hi
     * @param depth
     * @return
     */
    public static int rank(int[] arr, int key,int lo, int hi, int depth) {
        for (int i=0; i<depth; i++) {
            StdOut.printf(" ");
        }
        StdOut.printf("lo=%-2s  hi=%-2s", lo, hi);
        StdOut.println();
        if (hi < lo) return -1;
        int mid = lo + (hi - lo) / 2;
        if (key == arr[mid]) return mid;
        if (key > arr[mid]) return rank(arr, key, mid+1, hi, ++depth);
        else return rank(arr, key, lo, mid-1, ++depth);
    }


    /**
     * 使用循环实现二分查找
     *
     * key要么在arr[0, length-1]，要么不在
     *
     * @param arr 必须有序
     * @param key
     * @return
     */
    public static int BinarySearch_rank(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length-1;
        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2; // 注意计算中间数的方式
            StdOut.printf("lo=%-2s  hi=%-2s  mid=%-2s", lo, hi, mid);
            StdOut.println();
            if (key == arr[mid]) return mid;
            if (key > arr[mid]) lo = mid+1; // 注意+1
            else if (key < arr[mid]) hi = mid-1; // 注意-1
        }
        return -1;
    }

}
