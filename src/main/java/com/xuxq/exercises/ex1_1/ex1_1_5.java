package com.xuxq.exercises.ex1_1;

/**
 * 编译后的class文件所在路径：xxx/com/xuxq/exercises/ex1_1/ex1_1_5.class
 * 请在xxx目录下执行如下命令：
 * java com.xuxq.exercises.ex1_1.ex1_1_5 0.5 0.5
 *
 */
public class ex1_1_5 {

    public static void main(String[] args) {

        if (args.length != 2) {
            System.out.println("参数错误");
            return;
        }

        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);

        if (test(x) && test(y)) {
            System.out.println("true");
        }
        else {
            System.out.println("false");
        }

    }

    public static boolean test(double x) {
        if (x > 0 && x < 1) {
            return true;
        }
        return false;
    }

}
