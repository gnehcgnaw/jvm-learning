package com.beatshadow.jvmlearning.chapter2;

/**
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/9 18:36
 */
public class Demo4 {
    public static void main(String[] args) {
        m1();
        StringBuffer stringBuffer = new StringBuffer();
        new Thread(()->{
            m2(stringBuffer);
        }).start();

        new Thread(()->{
            m2(stringBuffer);
        }).start();

        new Thread(()->{
            m2(new StringBuffer());
        }).start();

        new Thread(()->{
            m2(new StringBuffer());
        }).start();
    }

    public static void m1(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1);
        stringBuffer.append(2);
        stringBuffer.append(3);
        System.out.println(stringBuffer.toString());
    }

    /**
     * 有外来的参数
     * @param stringBuffer
     */
    public static  void m2(StringBuffer stringBuffer){
        stringBuffer.append(1);
        stringBuffer.append(2);
        stringBuffer.append(3);
        System.out.println(stringBuffer.toString());
    }

    /**
     * 逃离了方法的作用范围
     * @return
     */
    public static StringBuffer m3(){
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1);
        stringBuffer.append(2);
        stringBuffer.append(3);
        return stringBuffer;
    }
}
