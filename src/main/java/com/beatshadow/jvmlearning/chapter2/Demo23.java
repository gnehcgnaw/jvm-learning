package com.beatshadow.jvmlearning.chapter2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/11 01:52
 */
public class Demo23 {
    public static void main(String[] args) {
        List<String> stringList = new ArrayList<>();
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 10 ; i++) {
            BufferedReader bufferedReader = null;
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("src/main/resources/mac.words"),"utf-8"));
                String line = null ;
                long start = System.nanoTime();
                while (true){
                    line = bufferedReader.readLine();
                    if (line == null){
                        break;
                    }
                   stringList.add(line.intern());
                }
                System.out.println("cost:"+(System.nanoTime()-start)/1000000);
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
