package com.beatshadow.jvmlearning.chapter2;

/**
 * 验证全局变量线程安全问题
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/9 18:31
 */
public class Demo3 {
    /**
     *     x 为全局变量
     */
    static  int x = 0 ;
    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                method1();
            }
        };

        Thread thread1 = new Thread(runnable);
        thread1.start();


        Thread thread2 = new Thread(runnable);
        thread2.start();

    }

    private static void method1() {

        for (int i = 0; i < 100; i++) {
            x++ ;
        }
        System.out.println(x);
    }
}
