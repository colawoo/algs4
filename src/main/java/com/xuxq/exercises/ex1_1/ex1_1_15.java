package com.xuxq.exercises.ex1_1;

public class ex1_1_15 {

    public static void main(String[] args) {
        int[] a = {0,4,2,5,6,7,8,8,9};
        int m = 2;
        print(histogram(a, m));

        // 若给定数组中的所有元素都在[0, m-1]，那么最终返回数组的各元素和与给定数组的长度相等。
        int[] b = {0,0,0,0,0,1,1,1,1};
        int[] histogram = histogram(b, m);
        print(histogram);
        System.out.println(sum(histogram) == b.length);
    }

    public static int[] histogram(int[] a, int m) {
        int[] result = new int[m];
        for (int i=0; i<m; i++) {
            int t = 0;
            for (int j=0; j<a.length; j++) {
                if (a[j] == i) {
                    t++;
                }
            }
            result[i] = t;
        }

        return result;
    }

    public static void print(int[] a) {
        for (int i=0; i<a.length; i++) {
            System.out.print(a[i]);
            System.out.println("\t");
        }
        System.out.println();
    }


    public static int sum(int[] a) {
        int sum = 0;
        for (int i=0; i<a.length; i++) {
            sum += a[i];
        }
        return sum;
    }

}
