package com.beatshadow.jvmlearning.chapter2;


import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/**
 * 演示直接内存溢出
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/11 03:17
 */
public class Demo25 {
    static int _100Mb = 1024*1024*100 ;
    public static void main(String[] args) {
        List<ByteBuffer> list = new ArrayList<>();
        int i = 0 ;
        try{
            while (true){
                ByteBuffer byteBuffer = ByteBuffer.allocateDirect(_100Mb);
                list.add(byteBuffer);
                i++;
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }finally {
            System.out.println(i);
        }

    }

}
