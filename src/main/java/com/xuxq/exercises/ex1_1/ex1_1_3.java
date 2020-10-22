package com.xuxq.exercises.ex1_1;

/**
 * 编译后的class文件所在路径：xxx/com/xuxq/exercises/ex1_1/ex1_1_3.class
 * 请在xxx目录下执行如下命令：
 * java com.xuxq.exercises.ex1_1.ex1_1_3 haha haha haha
 *
 */
public class ex1_1_3 {

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("参数错误");
            return;
        }
        if (args[0].equals(args[1]) && args[0].equals(args[2])) {
            System.out.println("equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
