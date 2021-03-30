package cn.tedu.api.day13;

import java.io.*;

//本类用来测试字节输出流
public class Test1_OutputStream {
    public static void main(String[] args) {
       // method();//普通字节输出流
        method1();//高效字节输出流
    }
    public static void method1(){
        //创建高效字节流对象
    OutputStream out = null;
        try {
            out = new BufferedOutputStream(new FileOutputStream
                    (new File("D:\\ready\\1.txt"),true));
            out.write(97);
            out.write(98);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    public static void method() {
        //需要在windows环境下创建一个文件.路径:D:\\ready\\out.txt
        //注意:指定的是文件路径不是文件集路劲,而且文件得存在
        //创建流对象
        //输出数据
        //释放资源
        OutputStream out = null;
        try {
            out = new FileOutputStream(new File("D:\\ready\\out.txt"));
            out.write(97);
            out.write(98);
            out.write(99);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
