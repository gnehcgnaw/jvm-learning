package com.beatshadow.jvmlearning.chapter2;

import java.util.concurrent.TimeUnit;

/**
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/9 21:45
 */
public class Demo10 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("1....");
        TimeUnit.MILLISECONDS.sleep(30000);
        byte [] bytes = new byte[1024*1024*10] ;
        System.out.println("2....");
        TimeUnit.MILLISECONDS.sleep(30000);
        bytes = null ;
        System.gc();
        System.out.println("3....");
        TimeUnit.MILLISECONDS.sleep(1000000L);
    }
}
