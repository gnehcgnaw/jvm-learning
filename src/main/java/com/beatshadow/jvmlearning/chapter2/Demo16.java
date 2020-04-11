package com.beatshadow.jvmlearning.chapter2;

/**
 * 解读 String s4 = s1+s2 ;
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/10 17:30
 */
public class Demo16 {
    public static void main(String[] args) {
        String s1 = "a" ;
        String s2 = "b" ;
        String s3 = "ab" ;
        String s4 = s1+s2 ; // 使用javap可以看出，这句代码其实等同于 new StringBuffer().append(s1).append(s2);
        System.out.println(s3 == s4);
    }
}
