package com.beatshadow.jvmlearning.chapter2;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/**
 * 案例：垃圾回收后，内存占用仍然很高，如果查找问题
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/9 22:52
 */
public class Demo11 {
    public static void main(String[] args) throws InterruptedException {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 200 ; i++) {
            arrayList.add(new Student());
        }
        TimeUnit.MINUTES.sleep(5);
    }
}

class Student{
    private byte[] bytes = new byte[1024*1024];
}
