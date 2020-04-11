package com.beatshadow.jvmlearning.chapter2;

import java.io.*;

/**
 * -XX:StringTableSize=200000 -XX:+PrintStringTableStatistics
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/11 01:24
 */
public class Demo22 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/mac.words"),"utf-8"));
            String line = null;
            long start = System.nanoTime();
            while (true){
                line = bufferedReader.readLine();
                if (line==null){
                    break;
                }
                line.intern();
            }
            System.out.println("cost:"+(System.nanoTime()-start)/1000000);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
