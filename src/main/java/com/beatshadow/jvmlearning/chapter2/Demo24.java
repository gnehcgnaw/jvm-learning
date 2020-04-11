package com.beatshadow.jvmlearning.chapter2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * NIO 与 IO性能对比
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/11 02:41
 */
public class Demo24 {
    static final String FROM = "/Users/gnehcgnaw/Downloads/课件笔记源码资料.zip" ;
    static final String TO = "/Users/gnehcgnaw/Desktop/课件笔记源码资料.zip" ;
    static final int _1MB = 1024*1024 ;
    public static void main(String[] args) {
        io();
        directBuffer();
    }

    private static void directBuffer() {
        long start = System.nanoTime();
        try {
            FileChannel from = new FileInputStream(FROM).getChannel();
            FileChannel to = new FileOutputStream(TO).getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_1MB);
            while (true){
                int len = from.read(byteBuffer);
                if (len == -1){
                    break;
                }
                byteBuffer.flip();
                to.write(byteBuffer);
                byteBuffer.clear();
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime() ;
        System.out.println("nio 用时 ："+(end -start)/1000_000.0);
    }

    private static void io() {
        long start = System.nanoTime();
        try {
            FileInputStream fileInputStream = new FileInputStream(FROM);
            FileOutputStream fileOutputStream = new FileOutputStream(TO);
            byte[] bytes = new byte[_1MB];
            while (true){
                int len = fileInputStream.read(bytes);
                if (len == -1){
                    break;
                }
                fileOutputStream.write(bytes,0,len);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime() ;
        System.out.println("io 用时 ："+(end -start)/1000_000.0);
    }
}
