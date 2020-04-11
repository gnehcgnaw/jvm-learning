package com.beatshadow.jvmlearning.chapter2;

/**
 * 说明常量池和String Table的关系
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/10 16:49
 */
public class Demo15 {
    public static void main(String[] args) {
        //常量池中的信息，都会被加载到运行时常量池中，这是 a、b、ab都是常量池中的符号，还没有变为Java字符串对象
        //只有在执行到该行程序的时候才会把a符号变为"a"字符串对象，而这个过程细节操作为：
        //首先拿着"a"到String Table中查找，有没有"a"，如果有就直接把地址映射到这个对象上，如果没有就在String Table中添加一个，
        //String Table其实就是一个hashtable，并且不能扩容
        String s1 = "a" ;
        String s2 = "b" ;
        String s3 = "ab" ;
    }
}
