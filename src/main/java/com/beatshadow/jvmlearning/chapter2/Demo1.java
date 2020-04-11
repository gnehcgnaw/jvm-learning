package com.beatshadow.jvmlearning.chapter2;

/**
 * 演示栈帧
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/9 18:05
 */
public class Demo1 {
    public static void main(String[] args) {
        int m = method1(1);
        System.out.println(m);
    }

    private static int method1(int i) {
        int y = i +1;
        int z = method2(y);
        return z ;
    }

    private static int method2(int y) {
        int m = y+1;
        return m;
    }

}
