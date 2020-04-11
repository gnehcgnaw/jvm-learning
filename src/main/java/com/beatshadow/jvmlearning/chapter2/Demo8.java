package com.beatshadow.jvmlearning.chapter2;

import java.util.concurrent.TimeUnit;

/**
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/9 20:58
 */
public class Demo8 {
    static A a = new A();
    static B b = new B();
    public static void main(String[] args) throws InterruptedException {
        new Thread(()->{
            synchronized (a){
                try {
                    TimeUnit.SECONDS.sleep(2000);
                    synchronized (b){
                        System.out.println(Thread.currentThread().getName());

                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"a").start();
        TimeUnit.SECONDS.sleep(1000);
        new Thread(()->{
            synchronized (b){
                synchronized (a){
                    System.out.println(Thread.currentThread().getName());

                }

            }
        },"b").start();

    }
}

class A{}
class B{}