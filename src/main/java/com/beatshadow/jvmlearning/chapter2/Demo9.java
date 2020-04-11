package com.beatshadow.jvmlearning.chapter2;

import java.util.ArrayList;

/**
 * 演示堆内存溢出
 * -Xmx8m
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/9 21:36
 */
public class Demo9 {
    public static void main(String[] args) {
        int i = 0 ;

        ArrayList arrayList = new ArrayList();
        String a = "hello" ;
        while (true){
            arrayList.add(a);
            a = a + a ;
            i++ ;
        }


    }
}
