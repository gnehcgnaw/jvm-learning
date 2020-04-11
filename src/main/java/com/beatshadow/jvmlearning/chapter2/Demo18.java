package com.beatshadow.jvmlearning.chapter2;

/**
 * 首次使用才将常量池中的字符串符号变成对象
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/10 18:10
 */
public class Demo18 {
    public static void main(String[] args) {
        String s1 = "1" ;// 在此处打断点
        String s2 = "2" ;
        String s3 = "3" ;
        String s4 = "4" ;
        String s5 = "5" ;

        String s6 = "6" ;
        String s7 = "7" ;
        String s8 = "8" ;
        String s9 = "9" ;
        String s10 = "10" ;


        String s11 = "1" ;  //在此次打断点
        String s12 = "2" ;
        String s13 = "3" ;
        String s14 = "4" ;
        String s15 = "5" ;

        String s16 = "6" ;
        String s17 = "7" ;
        String s18 = "8" ;
        String s19 = "9" ;
        String s20 = "10" ;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);
        System.out.println(s7);
        System.out.println(s8);
        System.out.println(s9);
        System.out.println(s10);
        System.out.println(s11);
        System.out.println(s12);
        System.out.println(s13);
        System.out.println(s14);
        System.out.println(s15);
        System.out.println(s16);
        System.out.println(s17);
        System.out.println(s18);
        System.out.println(s19);
        System.out.println(s20);
    }
}
