package com.beatshadow.jvmlearning.chapter2;

import org.junit.Test;

/**
 * 验证：可以使用intern方法，主动将串池中没有的字符串放入串池
 *      1.8将这个字符串对象尝试放入串池，如果有则并不会放入，如果没有则放入串池，会把串池中的对象返回。
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/10 21:44
 */
public class Demo19 {
    @Test
    public void test1(){
        String s1 = new String ("abc");
        String intern = s1.intern();
        String s2 = "abc" ;

        System.out.println(s1==intern); //false
        System.out.println(intern == s2);   //true
        System.out.println(s1 == s2); //false
    }

    @Test
    public void test2(){
        String s1 = "abc" ;
        String s2 = new String("abc");
        String intern = s2.intern();
        System.out.println(s1==s2); // false
        System.out.println(s1==intern); //true
        System.out.println(s2==intern); // false
    }
}
