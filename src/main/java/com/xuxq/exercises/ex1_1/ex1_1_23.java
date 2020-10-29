package com.xuxq.exercises.ex1_1;

import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * java -Dfile.encoding=UTF-8 -classpath /Users/mac/Workspace/IdeaProjects/algs4/target/classes:/Users/mac/.m2/repository/edu/princeton/cs/algs4/1.0.4/algs4-1.0.4.jar com.xuxq.exercises.ex1_1.ex1_1_23 algs4-data/tinyW.txt + < algs4-data/tinyT.txt
 */
public class ex1_1_23 {

    public static void main(String[] args) {
        String symbol = args[1];
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);

        while (!StdIn.isEmpty()) {
            int key = StdIn.readInt();
            boolean flag = rank(whitelist, key) == -1;
            if ("+".equals(symbol) && flag) {
                StdOut.println(key);
            } else if ("-".equals(symbol) && !flag) {
                StdOut.println(key);
            }
        }
    }


    public static int rank(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length-1;
        while (hi >= lo) {
            int mid = lo + (hi - lo) / 2;
            if (key == arr[mid]) return mid;
            if (key > arr[mid]) lo = mid+1;
            else if (key < arr[mid]) hi = mid-1;
        }
        return -1;
    }

}
