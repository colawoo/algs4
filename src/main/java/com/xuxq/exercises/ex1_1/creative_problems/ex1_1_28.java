package com.xuxq.exercises.ex1_1.creative_problems;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

/**
 * java -Dfile.encoding=UTF-8 -classpath /Users/mac/Workspace/IdeaProjects/algs4/target/classes:/Users/mac/.m2/repository/edu/princeton/cs/algs4/1.0.4/algs4-1.0.4.jar com.xuxq.exercises.ex1_1.creative_problems.ex1_1_28 < algs4-data/tinyT.txt
 */
public class ex1_1_28 {

    public static void main(String[] args) {

        int[] ints = StdIn.readAllInts();
        Arrays.sort(ints);

        for (int i=0; i<ints.length; i++) {
            StdOut.printf("%-5s", ints[i]);
        }

        int index = 1;
        for (int i=1; i<ints.length; i++) {
            if (ints[i] != ints[i-1]) {
                ints[index++] = ints[i];
            }
        }

        System.out.println();
        for (int i=0; i<index; i++) {
            StdOut.printf("%-5s", ints[i]);
        }

    }

}
