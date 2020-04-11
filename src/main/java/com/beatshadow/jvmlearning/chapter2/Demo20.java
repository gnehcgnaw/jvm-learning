package com.beatshadow.jvmlearning.chapter2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * • 1.8：-Xmx10m -XX:-UseGCOverheadLimit
 * • 1.6：-XX:MaxPermSize=10m
 * 如果怎么StringTable所处的错误？根据错误提示判定所处位置。
 *
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/10 22:28
 */
public class Demo20 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        int i = 0 ;
        try{
            for (int j = 0; j < 260000; j++) {
                list.add(String.valueOf(j).intern());
                i++ ;
            }
        }catch (Throwable throwable){
            throwable.printStackTrace();
        }finally {
            System.out.println(i);
        }

    }
}
