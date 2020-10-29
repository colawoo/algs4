package com.xuxq.exercises.ex1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;

public class ex1_1_21 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        while (!StdIn.isEmpty()) {
            String line = StdIn.readLine();
            list.add(line);
        }

        print(list);
    }

    private static void print(List<String> list) {
        for (String s : list) {
            String[] arr = s.split(",");
            double temp = Double.parseDouble(arr[1]) / Double.parseDouble(arr[2]);
            StdOut.printf("%-10s   %-10s   %-10s   %-10.3f\n", arr[0], arr[1], arr[2], temp);
        }
    }

}
