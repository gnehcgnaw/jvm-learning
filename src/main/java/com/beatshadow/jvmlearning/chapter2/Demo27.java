package com.beatshadow.jvmlearning.chapter2;

import sun.misc.Unsafe;

import java.io.IOException;
import java.lang.reflect.Field;

/**
 * 直接内存的分配和释放
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/11 03:51
 */
public class Demo27 {
    static int _1Gb = 1024*1024*1024 ;

    public static void main(String[] args) {
        try {
            Unsafe unsafe = getUnsafe();
            long base = unsafe.allocateMemory(_1Gb);
            unsafe.setMemory(base,0,(byte)0);
            System.in.read();

            unsafe.freeMemory(base);
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static Unsafe getUnsafe(){
        try {
            Field theUnsafe = Unsafe.class.getDeclaredField("theUnsafe");
            theUnsafe.setAccessible(true);
            Unsafe unsafe = (Unsafe) theUnsafe.get(null);
            return unsafe ;
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
