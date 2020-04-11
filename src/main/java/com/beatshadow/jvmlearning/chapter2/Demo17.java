package com.beatshadow.jvmlearning.chapter2;

/**
 * 解读 String s5 = "a" + "b" ;
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/10 17:58
 */
public class Demo17 {
    public static void main(String[] args) {
        String s1 = "a" ;
        String s2 = "b" ;
        String s3 = "ab" ;
        String s4 = s1+s2 ;
        String s5 = "a" + "b" ;
        //String s5 = "a"+"b"，是从String Table中直接拿的“ab”
        //产生的疑问：为什么直接找到的是ab,而不是先找a，后找b，然后拼接呢？而且直接找“ab”是怎么做到的呢？
        // 其实这是，javac在编译器的优化，因为都是不变的常量，故而结果在编译器已经确定为“ab”。
        //故而：System.out.println(s3 == s5); 的运行结果是true。
        System.out.println(s3 == s4);
        System.out.println(s3 == s5);
    }
}
