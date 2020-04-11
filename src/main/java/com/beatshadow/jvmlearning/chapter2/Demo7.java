package com.beatshadow.jvmlearning.chapter2;

/**
 * 线程诊断：cpu占用高的问题
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/9 20:27
 */
public class Demo7 {
    public static void main(String[] args) {
        Thread t1 =  new Thread(()->{
            while (true){


            }
        },"t1");

        t1.start();

        Thread t2 =  new Thread(()->{
        },"t2");

        t2.start();

    }
}
