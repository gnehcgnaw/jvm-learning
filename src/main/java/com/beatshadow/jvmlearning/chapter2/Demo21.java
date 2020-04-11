package com.beatshadow.jvmlearning.chapter2;

/**
 * StringTable垃圾回收
 * -Xmx10m -XX:+PrintStringTableStatistics -XX:+PrintGCDetails -verbose:gc
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/10 23:49
 */
public class Demo21 {
    public static void main(String[] args) {
        int i = 0;
        try {
            for (int j = 0; j <100000 ; j++) {
                String.valueOf(j).intern();
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }finally {
            System.out.println(i);
        }
    }
}
