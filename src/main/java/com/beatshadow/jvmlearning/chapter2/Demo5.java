package com.beatshadow.jvmlearning.chapter2;

/**
 * 使用递归程序演示栈帧过多导致内存溢出
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/9 18:52
 */
public class Demo5 {
    public static void main(String[] args) {
        method1(1);
    }

    private static void method1(int i) {
        i++;
        System.out.println(i);
        method1(i);

    }
}
