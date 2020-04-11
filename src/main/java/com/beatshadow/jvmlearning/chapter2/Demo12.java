package com.beatshadow.jvmlearning.chapter2;

//因为无法打包，故而不实用Java自带的
//import com.sun.xml.internal.ws.org.objectweb.asm.ClassWriter;
//import jdk.internal.org.objectweb.asm.Opcodes;

import org.springframework.asm.ClassWriter;
import org.springframework.asm.Opcodes;

/**
 * 演示元空间内存溢出
 * -XX:MaxMetaspaceSize=8m
 * @author : <a href="mailto:gnehcgnaw@gmail.com">gnehcgnaw</a>
 * @since : 2020/4/10 12:04
 */
public class Demo12 extends ClassLoader{    //可以用来加载类的二进制字节码
    public static void main(String[] args) {
        int j = 0;
        try {
            Demo12 demo12 = new Demo12() ;
            for (int i = 0; i < 10000; i++,j++) {
                //ClassWriter作用是生成类的二进制字节码
                ClassWriter classWriter = new ClassWriter(0);
                // 版本号、public、类名、包名、父类、接口
                classWriter.visit(Opcodes.V1_8,Opcodes.ACC_PUBLIC,"Class"+i,null,"java/lang/Object",null);
                // 返回 byte[]
                byte [] bytes = classWriter.toByteArray();
                //执行类的加载
                demo12.defineClass("Class"+i,bytes,0,bytes.length);
            }

        }catch (Exception e){
            throw e ;
        } finally {
            System.out.println(j);
        }

    }
}
