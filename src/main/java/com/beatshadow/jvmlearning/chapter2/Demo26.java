package com.beatshadow.jvmlearning.chapter2;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * 演示直接内存的分配和释放
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/11 03:31
 */
public class Demo26 {
    static int _1Gb = 1024*1024*1024 ;

    public static void main(String[] args) {

        try {
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_1Gb);
            System.out.println("分配内存");
            System.in.read() ;
            System.out.println("开始释放");
            byteBuffer = null ;
            System.gc();
            System.in.read() ;
            System.out.println("运行结束");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
